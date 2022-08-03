package com.insta.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/login")
//    @ResponseBody
    public String loginForm(){
        return "login";
    }
}
