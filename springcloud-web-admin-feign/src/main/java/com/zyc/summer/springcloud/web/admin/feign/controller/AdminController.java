package com.zyc.summer.springcloud.web.admin.feign.controller;

import com.zyc.summer.springcloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "Hi")
    public String sayHi(@RequestParam String message) {
        return adminService.sayHi(message);
    }
}