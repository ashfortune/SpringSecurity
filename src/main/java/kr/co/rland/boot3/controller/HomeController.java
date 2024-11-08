package kr.co.rland.boot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // @ResponseBody
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
