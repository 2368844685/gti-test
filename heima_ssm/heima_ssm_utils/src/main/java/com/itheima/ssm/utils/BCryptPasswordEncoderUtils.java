package com.itheima.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args){
        String password="123";
        String pwd = encodePassword(password);
        // $2a$10$Qw.SzpbwY6l5uBRy3MvNoekJ94PtRjFLgsjrBFlGdb5sDhg6yLUdi
        // $2a$10$mZ8Yc.n79mDVl8Je6vzOqOHg2yZNnVATjPA19BvBxGXHNNE4WdGEe
        System.out.println(pwd);
    }
}
