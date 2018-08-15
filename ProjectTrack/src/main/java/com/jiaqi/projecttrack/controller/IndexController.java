package com.jiaqi.projecttrack.controller;


import com.jiaqi.projecttrack.entity.User;
import com.jiaqi.projecttrack.mapper.UserMapper;
import com.jiaqi.projecttrack.service.UserService;
import javafx.application.Application;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.ArrayList;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    String toIndex(Model model) {
        User user = new User();
        user.setId(2351);
        userService.insert(user);
        return "index";
    }
}
