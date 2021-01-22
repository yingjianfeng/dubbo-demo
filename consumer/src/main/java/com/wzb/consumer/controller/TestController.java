package com.wzb.consumer.controller;


import com.wzb.service.TestService;
import com.wzb.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * @author Satsuki
 * @time 2019/8/27 15:58
 * @description:
 * 调用dubbo
 */
@RestController
public class TestController {

//    @Resource
//    private TestService testServiceImpl;
    @Reference(version = "1.0.0")
    private TestService testServiceImpl;

    @Reference(version = "1.0.0")
    private UserService userService;

    private static AtomicInteger num = new AtomicInteger();

    @RequestMapping("/ins")
    public String ins(){
        testServiceImpl.ins();
        return "ins-->"+num.incrementAndGet();
    }

    @RequestMapping("/del")
    public String del(){
        testServiceImpl.del();
        return "del";
    }

    @RequestMapping("/upd")
    public String upd(){
        testServiceImpl.upd();
        return "upd";
    }

    @RequestMapping("/sel")
    public String sel(){
        testServiceImpl.sel();
        return "sel";
    }

    @RequestMapping("/login")
    public String login(){
        userService.login();
        return "login";
    }
}
