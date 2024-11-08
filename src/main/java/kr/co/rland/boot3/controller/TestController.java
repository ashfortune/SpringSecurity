package kr.co.rland.boot3.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello World!";
    }


    @GetMapping("hi")
    public String hi(String name, HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("name", name);
        cookie.setPath("/");
        cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);


        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        request.getServletContext().setAttribute("name", name);


        return "hi!";
    }

    @GetMapping("say")
    public String say(HttpServletRequest request,
                      @CookieValue(name = "name") String cookieValue) {
        HttpSession session = request.getSession(); //세션저장소
        ServletContext servletContext = request.getServletContext(); //어플리케이션저장소

//        Cookie[] cookies = request.getCookies();
//        String cookieValue = null;
//        for(Cookie cookie : cookies) {
//            if(cookie.getName().equals("name")) {
//                cookieValue = cookie.getValue();
//            }
//        }

        return "hi! " + session.getAttribute("name") + servletContext.getAttribute("name") + ", cookie:"
                + cookieValue;
    }


}
