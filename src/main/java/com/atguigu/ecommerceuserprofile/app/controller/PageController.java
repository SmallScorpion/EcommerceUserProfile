package com.atguigu.ecommerceuserprofile.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: PageController
 * @Description:
 * @Author: SmallScorpion on 2020/6/12 12:02
 * @Version: 1.0
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/tags")
    public String tags(){
        return "tags";
    }

}