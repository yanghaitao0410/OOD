package com.yht.threadpool;


import java.util.concurrent.BlockingQueue;

public class WorkerThread extends  Thread {
    private BlockingQueue taskQueue = null;
    private boolean isStopped = false;

    public WorkerThread(BlockingQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    public void run() {
        while(!isStopped()) {
            try {
                /**线程从阻塞队列中获取任务，若没有任务就会阻塞
                 *
                 */
                Task task = (Task)taskQueue.take();
                task.execute();
            }catch (InterruptedException e) {
                //log or otherwise report exception
                //but keep pool thread alive
            }
        }
    }

    public synchronized void doStop() {
        isStopped = true;
        /**
         * 此处使用中段是为了在线程池停止的时候唤醒阻塞的线程，然后线程会进入run()
         * 此时isStopped()为true，不在执行逻辑处理
         */
        this.interrupt(); //break pool thread out of dequeue()
    }

    public synchronized boolean isStopped() {
        return isStopped;
    }

}
