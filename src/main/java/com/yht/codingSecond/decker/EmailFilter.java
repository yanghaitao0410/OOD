package com.yht.codingSecond.decker;

public class EmailFilter implements Email{
    private Email email;

    public EmailFilter(Email email) {
        this.email = email;
    }

    public String getContent() {
        return email.getContent();
    }

}
