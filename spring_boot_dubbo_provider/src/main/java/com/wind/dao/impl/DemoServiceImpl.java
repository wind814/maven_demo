package com.wind.dao.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wind.dao.DemoService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {


    @Override
    public void Demo() {
        System.out.println("demo");
    }
}
