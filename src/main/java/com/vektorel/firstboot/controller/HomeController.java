package com.vektorel.firstboot.controller;

import com.vektorel.firstboot.entity.Product;
import com.vektorel.firstboot.models.ShopPageResponseModel;
import com.vektorel.firstboot.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("home")
@RequiredArgsConstructor
public class HomeController {

    private final ProductService productService;

    @GetMapping("shop")
    public ModelAndView getShopPage(){

        ModelAndView modelAndView= new ModelAndView();

        ShopPageResponseModel model= new ShopPageResponseModel();

        model.setProductList(productService.getAllProducts());
        model.setTel("555555555");
        model.setEmail("furkanhocavektorel@gmail.com");

        modelAndView.addObject("model",model);

        modelAndView.setViewName("shop");

        return modelAndView;
    }

}
