package com.yht.codingSecond.srp.good;

public class MailBody {

    protected String subject = null;
    protected String message = null;
    protected User user;

    public MailBody(String productName, User user) {
        this.user = user;
        subject = "您关注的产品降价了";
        message = "尊敬的 "+user.getName()+", 您关注的产品 " + productName + " 降价了，欢迎购买!" ;
    }
}
