package com.vektorel.firstboot.controller;

import com.vektorel.firstboot.models.LoginModel;
import com.vektorel.firstboot.models.RegisterModel;
import com.vektorel.firstboot.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class LoginRegisterController {

    private final CustomerService customerService;

    public LoginRegisterController(CustomerService customerService) {
        this.customerService = customerService;
    }


    // localhost:8081
    @GetMapping("")
    public ModelAndView login(){
        ModelAndView modelView= new ModelAndView();

        modelView.setViewName("login");

        return modelView;
    }


    @PostMapping("login")
    public Object login(LoginModel loginModel){

        boolean b=customerService.login(loginModel);

        if (b){
            return "redirect:/home/shop" ;
        }
        return "redirect:/registerpage";

    }


    @GetMapping("registerpage")
    public ModelAndView register(){
        ModelAndView modelAndView= new ModelAndView();

        modelAndView.setViewName("register");
        return modelAndView;
    }

    @PostMapping("register")
    public Object register(RegisterModel model){

        customerService.saveCustomer(model);


        return "redirect:/";
    }




}
