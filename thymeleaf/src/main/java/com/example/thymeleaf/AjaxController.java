package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class AjaxController {

    @GetMapping
    public String home() {
        return "test"; // templates/index.html
    }

    @PostMapping("/form")
    @ResponseBody
    public UserVO submit(@RequestBody UserVO user) {
        // 실제로는 DB에 저장 가능
        System.out.println("이름: " + user.getName());
        System.out.println("나이: " + user.getAge());
        return user; // JSON으로 응답
    }
}
