package com.afly.service;

import com.afly.domain.Account;

import java.util.List;

/**
 * @Author wanghongfei
 * @Description:
 * @Date: Created in 17:11 2020/5/22
 */
public interface AccountService {

    public List<Account> findAll();

    public void saveAccount(Account account);

}
