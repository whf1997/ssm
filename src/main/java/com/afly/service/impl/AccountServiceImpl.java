package com.afly.service.impl;

import com.afly.dao.AccountDao;
import com.afly.domain.Account;
import com.afly.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wanghongfei
 * @Description:
 * @Date: Created in 17:15 2020/5/22
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("保存账户...");
        accountDao.saveAccount(account);
    }
}
