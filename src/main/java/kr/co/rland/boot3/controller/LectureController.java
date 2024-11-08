package kr.co.rland.boot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lecture")
public class LectureController {
    
    @GetMapping("list")
    public String list(){
        return "lecture/list";
    }

    
    @GetMapping("detail")
    public String detail(){
        return "lecture/detail";
    }

}
