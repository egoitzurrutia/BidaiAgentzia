package com.BidaiAgentzia.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerLogin {

    
    @GetMapping({"/", ""})
    public String index() {
        return "index"; 
    }

    @GetMapping({"/home"})
    public String home() {
        return "home"; 
    }
    @GetMapping("/register")
    public String register() {
        return "register"; 
    }
}
