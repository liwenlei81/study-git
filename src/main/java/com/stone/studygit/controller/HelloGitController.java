package com.stone.studygit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGitController {


    @RequestMapping("/helloGit")
    public String helloGit(){

        return "Hello Git v1.0 !";
    }
}
