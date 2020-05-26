package com.afly.test;

import com.afly.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wanghongfei
 * @Description:
 * @Date: Created in 17:48 2020/5/22
 */
public class TestSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService =(AccountService) ac.getBean("accountService");

        accountService.findAll();
    }

}
