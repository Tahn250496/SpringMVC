package com.laptrinhjavaweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//Để file java thông thường trở thành 1 controller ta thêm @Controller

@Controller
public class HomeController {

    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView homePage(){
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }

//    @RequestMapping(value = "/springmvc", method = RequestMethod.GET)
//    public ModelAndView springMVCPage() {
//        ModelAndView mav = new ModelAndView("springmvc");
//        return mav;
//    }
}