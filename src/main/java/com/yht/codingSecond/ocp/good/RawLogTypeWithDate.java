package com.yht.codingSecond.ocp.good;

public class RawLogTypeWithDate extends RawLogType {

    @Override
    public void setLogMsg(String logMsg) {
        String txtDate = DateUtil.getCurrentDateAsString();
        logMsg = txtDate + ": " + logMsg;
    }
}
