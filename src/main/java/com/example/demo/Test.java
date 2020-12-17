package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class Test {
@RequestMapping(value="/", method=RequestMethod.GET)
public ModelAndView indexGet(ModelAndView mv){
	
mv.addObject("fact", "階乗の計算をします。");
mv.setViewName("test");
return mv;
}

@RequestMapping(value="/homework", method=RequestMethod.POST)
public ModelAndView indexPost(ModelAndView mv, @RequestParam("number")int
number) {

int fact = 1;
for(int i = 1; i <= number; i++) {
	 fact *= i;
}

mv.addObject("fact", Integer.toString(number) + "の階乗は" + Integer.toString(fact) + "です");
mv.setViewName("test");
return mv;
}
}