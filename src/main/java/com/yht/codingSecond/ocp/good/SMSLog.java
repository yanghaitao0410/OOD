package com.yht.codingSecond.ocp.good;

public class SMSLog extends Log{

	@Override
	public void send(String logMsg) {
		System.out.println("以SMS方式发信：" + logMsg);
	}

}
