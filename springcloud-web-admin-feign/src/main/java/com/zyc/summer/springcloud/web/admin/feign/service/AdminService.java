package com.zyc.summer.springcloud.web.admin.feign.service;


import com.zyc.summer.springcloud.web.admin.feign.Hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springcloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam(value = "message") String message);
}
