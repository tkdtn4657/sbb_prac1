package com.mysite.sbb_prac1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sbb")
    @ResponseBody
    public void index(){
        System.out.println("index");
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }


}
