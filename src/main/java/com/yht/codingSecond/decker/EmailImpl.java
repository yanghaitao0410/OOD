package com.yht.codingSecond.decker;

public class EmailImpl implements Email {
    private String content;

    public EmailImpl(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
