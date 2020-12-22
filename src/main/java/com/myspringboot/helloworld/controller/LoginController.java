package com.myspringboot.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model,HttpSession session){

        if (username == "wenjian" && password != null){
            session.setAttribute("user",username);
            return "redirect:/main.html";
        }
        model.addAttribute("msg","用户名或密码错误");
        return "index";
    }
}
