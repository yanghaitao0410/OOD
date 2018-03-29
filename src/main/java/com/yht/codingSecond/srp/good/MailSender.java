package com.yht.codingSecond.srp.good;

import java.io.IOException;
import java.util.List;

public class MailSender {

    protected String fromAddress = null;

    private SMTPUtil smtpUtil = null;


    public MailSender() {
        smtpUtil = new SMTPUtil();
        fromAddress = "yht@king.com";
    }



    public MailBody configureEMail(User user, List<Product> products) throws IOException {

        if(user.getEmailAddress() != null) {
            String productDesc = "";
            for (Product product : products) {
                productDesc += product.getProductDesc() + ",";
            }

            return new MailBody(productDesc, user);
        }
        throw new RuntimeException("没有发送地址！！！");
    }

    protected void sendEMails(boolean debug, List<User> users, List<Product> products) throws IOException {

        System.out.println("开始发送邮件");

        if (users != null) {
            for(User user : users) {
                MailBody mailBody = configureEMail(user, products);

                try {
                    sendEmail(mailBody, smtpUtil.smtpHost, debug);
                } catch (Exception e) {
                    try {
                        sendEmail(mailBody, smtpUtil.altSmtpHost, debug);

                    } catch (Exception e2) {
                        System.out.println("通过备用 SMTP服务器发送邮件失败: " + e2.getMessage());
                    }
                }
            }
        } else {
            System.out.println("没有邮件发送");
        }
    }

    private void sendEmail(MailBody mailBody, String smtpHost, boolean debug) {
        //假装发了一封邮件
        StringBuilder buffer = new StringBuilder();
        //TODO 获取当前用户Email
        buffer.append("From:").append(fromAddress).append("\n");
        buffer.append("To:").append(mailBody.user.getEmailAddress()).append("\n");
        buffer.append("Subject:").append(mailBody.subject).append("\n");
        buffer.append("Content:").append(mailBody.message).append("\n");
        System.out.println(buffer.toString());

    }
}
