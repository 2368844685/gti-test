package com.service.impl;

import com.dao.IAccountDao;
import com.factory.BeanFactory;
import com.service.IAcountService;

/*
 * 账户的业务层实现类
 * */
public class AccountServiceImpl implements IAcountService {

    // private IAccountDao accountDao = new AccountDaoImpl();
    private IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");

    // private int i = 1;

    public void saveAccount() {
        int i = 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
