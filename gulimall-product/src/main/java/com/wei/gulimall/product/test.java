package com.wei.gulimall.product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author xinhao
 * @Date 2023/7/22 16:07
 */
public class test {
    public static void main(String[] args) {
        Set<String> gradeName = new HashSet<>();
        gradeName.add("小伟");
        gradeName.add("小黄");
        gradeName.add("大枪");
        gradeName.add("小伟");
        System.out.println(gradeName.size());
        System.out.println(gradeName.toString());
        Iterator<String> iterator = gradeName.iterator();
        String next = iterator.next();

        System.out.println(next);
    }
}
