package com.afly.controller;

import com.afly.domain.Account;
import com.afly.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author wanghongfei
 * @Description:
 * @Date: Created in 17:18 2020/5/22
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public  String findAll(Model model){
        System.out.println("表现层:查询所有账户");
        List<Account> list= accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response){
       accountService.saveAccount(account);
        try {
            response.sendRedirect(request.getContextPath()+"/account/findAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ;
    }
}
