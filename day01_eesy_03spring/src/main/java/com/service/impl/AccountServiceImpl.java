package com.service.impl;

import com.dao.IAccountDao;
import com.dao.impl.AccountDaoImpl;
import com.service.IAcountService;

/*
 * 账户的业务层实现类
 * */
public class AccountServiceImpl implements IAcountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    // private int i = 1;

    public void saveAccount() {
        int i = 1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;
    }
}
