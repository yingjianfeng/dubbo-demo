package com.wzb.provider.service.impl;

import com.wzb.service.TestService;
import com.wzb.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title: UserServiceImpl
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/1/22 15:34
 */
@Service(version = "1.0.0",interfaceClass = UserService.class)
public class UserServiceImpl implements UserService
{
    private static AtomicInteger num = new AtomicInteger();
    @Override
    public void login() {
        System.out.println("login   "+num.incrementAndGet());
    }
}
