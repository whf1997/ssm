package com.afly.dao;

import com.afly.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author wanghongfei
 * @Description:
 * @Date: Created in 17:09 2020/5/22
 */
@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account(name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
