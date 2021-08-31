package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class DefaultController {

    @RequestMapping(value="/aaa",produces="text/plain;charset=utf-8")
    public String defaultController() {
        "coucou chat !"
    }
}
