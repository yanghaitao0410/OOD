package com.yht.codingSecond.ocp.good;

public class PrintLog extends Log{

	@Override
	public void send(String logMsg) {
		System.out.println("以print形式发信：" + logMsg);
	}



}
