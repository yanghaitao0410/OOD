package com.yht.codingSecond.ocp.good;

public class MailLog extends Log{

	@Override
	public void send(String logMsg) {
		System.out.println("以邮件形式发信：" + logMsg);
	}



}
