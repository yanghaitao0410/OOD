package com.yht.codingSecond.ocp.good;

public class Logger {
	
	private RawLogType rawLogType;
	private Log log;
			
	public Logger(RawLogType rawLogType, Log log){
		this.rawLogType = rawLogType;
		this.log = log;
	}

	public void log(String msg){
		
		rawLogType.setLogMsg(msg);
		log.send(rawLogType.getLogMsg());
	}
}

