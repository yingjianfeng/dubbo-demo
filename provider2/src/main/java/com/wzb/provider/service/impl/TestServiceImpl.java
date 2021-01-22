package com.wzb.provider.service.impl;

import com.wzb.service.TestService;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title: TestServiceImpl
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/1/22 14:45
 */
@Service(version = "1.0.0",interfaceClass = TestService.class)
//@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    private static AtomicInteger num = new AtomicInteger();
    @Override
    public void ins() {
        System.out.println("provider2  insert  "+num.incrementAndGet());
    }

    @Override
    public void del() {
        System.out.println("provider2  delete");
    }

    @Override
    public void upd() {
        System.out.println("provider2  update");
    }

    @Override
    public void sel() {
        System.out.println("provider2  select");
    }
}
