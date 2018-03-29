package com.yht.codingSecond.decker;

public class EmailStatement extends EmailFilter{
    public EmailStatement(Email email) {
        super(email);
    }

    @Override
    public String getContent() {
        return super.getContent() + "邮件声明！！";
    }
}
