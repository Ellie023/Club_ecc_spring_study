package com.example.firstproject.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "예린");
        return "greeting";
    }
    @GetMapping("/bye")
        public String seeYouNest(Model model){
        model.addAttribute("nickname","홍길동");
        return "goodbye";
        }
}
