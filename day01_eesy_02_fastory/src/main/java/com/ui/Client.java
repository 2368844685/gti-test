package com.ui;

import com.factory.BeanFactory;
import com.service.IAcountService;

/*
* 模拟一个表现层，用于调用业务层
* */
public class Client {
    public static void main(String[] args) {
        // AccountServiceImpl as = new AccountServiceImpl();
        for (int i = 0; i <5 ; i++) {
            IAcountService as = (IAcountService) BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }

    }
}
