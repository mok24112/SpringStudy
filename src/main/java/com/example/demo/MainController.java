package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class MainController {
@RequestMapping("/")
//public ModelAndView index(ModelAndView mv){
//mv.setViewName("index");
//return mv;
public String index(Model model){
model.addAttribute("name", "鈴木Java五郎");
return "index";
}
}
