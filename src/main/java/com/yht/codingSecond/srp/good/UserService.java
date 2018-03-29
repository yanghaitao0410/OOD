package com.yht.codingSecond.srp.good;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserService {

    public static List<User> getUser(List<Product> products){

        String sendMailQuery = "Select name, email from subscriptions "
                + "where product_id in ('" + products +"') "
                + "and send_mail=1 ";
        System.out.println("loadQuery set");

        //TODO 根据查出用户查出该用户含有的产品,并设置到user实例中

        List<User> userList = new ArrayList();
        for (int i = 1; i <= 3; i++) {
            User user = new User();
            user.setName("User" + i);
            user.setEmailAddress("User" + i + "@bb.com");
            userList.add(user);
//            HashMap userInfo = new HashMap();
//            userInfo.put("NAME", "User" + i);
//            userInfo.put("EMAIL", "aa@bb.com");
//            userList.add(userInfo);
        }
        return userList;
    }
}
