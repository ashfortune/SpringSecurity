package kr.co.rland.boot3.controller.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("teacherLectureController")
@RequestMapping("/teacher/lecture")
public class LectureController {
    
    @GetMapping("list")
    public String list(){
        return "teacher/lecture/list";
    }

    
    @GetMapping("detail")
    public String detail(){
        return "teacher/lecture/detail";
    }
}
