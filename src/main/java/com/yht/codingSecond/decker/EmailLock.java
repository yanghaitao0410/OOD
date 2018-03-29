package com.yht.codingSecond.decker;

public class EmailLock extends EmailFilter {
    public EmailLock(Email email) {
        super(email);
    }

    @Override
    public String getContent() {
        return super.getContent().hashCode()+ "加密了！！";
    }
}
