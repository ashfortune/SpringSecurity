package kr.co.rland.boot3.controller.admin;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.rland.boot3.service.NoticeService;
import kr.co.rland.boot3.entity.Notice;
import java.util.List;

@Controller
@RequestMapping("/admin/notice")
public class NoticeController {
    
    @Autowired
    private NoticeService service;

    @GetMapping("list")
//    @ResponseBody
    public String list(
//            HttpServletRequest request,
//            HttpServletResponse response
            // /admin/notice/list?p=1
            @RequestParam(name = "p", defaultValue = "1") Integer page,
            Model model
    ){
        int offset = page+1;

        List<Notice> notices = service.getList();
        model.addAttribute("notices", notices);
        model.addAttribute("test","Hello");
//        return service.getList();

         return "admin/notice/list";
    }
}
