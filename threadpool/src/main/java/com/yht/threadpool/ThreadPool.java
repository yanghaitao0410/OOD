package com.yht.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

    //阻塞队列
    private BlockingQueue taskQueue = null;
    private List<WorkerThread> threads = new ArrayList<>();
    private boolean isStopped = false;

    public ThreadPool(int numOfThreads, int maxNumOfTasks) {
        /**设置阻塞队列的长度
         *
         */
        taskQueue = new ArrayBlockingQueue(maxNumOfTasks);

        for(int i=0; i<numOfThreads; i++) {
            threads.add(new WorkerThread(taskQueue));
        }
        for(WorkerThread thread : threads) {
            thread.start();
        }
    }

    public synchronized void execute(Task task) throws  Exception {
        if(this.isStopped) {
            throw new IllegalStateException("ThreadPool is stopped!");
        }
        /**将任务放入阻塞队列
         *
         */
        this.taskQueue.add(task);
    }

    public synchronized void stop() {
        this.isStopped = true;
        for(WorkerThread thread : threads) {
            thread.doStop();
        }
    }



}
