package com.afly.test;

import com.afly.dao.AccountDao;
import com.afly.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author wanghongfei
 * @Description:
 * @Date: Created in 14:54 2020/5/23
 */
public class TestMybatis {

    @Test
    public void run1() throws Exception{
        //1.通过流将核心配置文件读取进来
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.通过核心配置文件创建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.通过会话工厂创建会话
        SqlSession sqlSession = factory.openSession();
        //4.获取到代理对象
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        //5.查询所有数据
        List<Account> list =mapper.findAll();
        for (Account account:list){
            System.out.println(account);
        }
        //6.关闭资源
        sqlSession.close();
        in.close();
    }

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void run2() throws Exception{

        Account account=new Account();
        account.setName("xiaoliao");
        account.setMoney(500d);
        //1.通过流将核心配置文件读取进来
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.通过核心配置文件创建会话工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.通过会话工厂创建会话
        SqlSession sqlSession = factory.openSession();
        //4.获取到代理对象
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        //5.查询所有数据
        mapper.saveAccount(account);
        sqlSession.commit();
        //6.关闭资源
        sqlSession.close();
        in.close();
    }
}
