package com.yht.ood.paymethod;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.yht.ood.payclassification.Paycheck;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoldMethod implements PaymentMethod {

    @Override
    public void pay(Paycheck paycheck) {
        System.out.println("放到财务，即用即取。");
    }

    @Test
    public void test1() {
        Pattern pattern = Pattern.compile("([a-z]+)-(\\d+)");
        Matcher matcher = pattern.matcher("type x-235, type y-3, type zw-465");

        while(matcher.find()) {
            for(int i=0; i < matcher.groupCount(); i++) {
                System.out.println("group("+ i +")=" + matcher.group(i));
            }
        }
    }

    @Test
    public void test2() {
        String str = "Oringe is 100yuan, Banana is 150 yuan.";
        String regex = "(\\d+)\\s*(yuan)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        String result = matcher.replaceAll("$2_$1");

        System.out.println(result);
    }
}
