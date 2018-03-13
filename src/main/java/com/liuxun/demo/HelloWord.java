package com.liuxun.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @RequestMapping(value = "/helloBoot",method = RequestMethod.GET)
    public String sayHellWord(){
            return "初次学习SpringBoot";
        }
}
