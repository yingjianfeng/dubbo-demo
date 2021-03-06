package com.wzb.provider.service.impl;

import com.wzb.service.TestService;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * @author Satsuki
 * @time 2019/8/27 15:35
 * @description:
 * 模拟数据库事务实现
 */
@Service(version = "1.0.0",interfaceClass = TestService.class)
//@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    private static AtomicInteger num = new AtomicInteger();
    @Override
    public void ins() {
        System.out.println("provider1  insert  "+num.incrementAndGet());
    }

    @Override
    public void del() {
        System.out.println("provider1  delete");
    }

    @Override
    public void upd() {
        System.out.println("provider1  update");
    }

    @Override
    public void sel() {
        System.out.println("provider1  select");
    }
}
