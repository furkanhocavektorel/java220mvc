package com.vektorel.firstboot.controller;

import com.vektorel.firstboot.models.RegisterModel;
import com.vektorel.firstboot.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("loginregister")
@RequiredArgsConstructor
public class LoginRegisterController {

    private final CustomerService customerService;


    // localhost:8081/loginregister/loginpage
    @GetMapping("loginpage")
    public ModelAndView login(){
        ModelAndView modelView= new ModelAndView();

        modelView.setViewName("login");

        return modelView;

    }



    // OPSİYONEL ODEV
    // LOGİN METODU (POST)YAZILACAK
    // LOGIN OLDUGUNDA HOME VEYA INDEX SAYFASI ACILACAK
    // YANLISSA TEKRAR LOGIN SAYFASI YUKLENECEK



    @GetMapping("registerpage")
    public ModelAndView register(){
        ModelAndView modelAndView= new ModelAndView();

        modelAndView.setViewName("register");
        return modelAndView;
    }

    @PostMapping("register")
    public Object register(RegisterModel model){

        customerService.saveCustomer(model);


        return "redirect:/loginregister/loginpage";
    }




}
