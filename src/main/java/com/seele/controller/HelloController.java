package com.seele.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// springMvc 控制器
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello,World";
    }

    @GetMapping("/seele")
    public String saySeele(){
        return "Hello,Seele";
    }
}
