package com.wind.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wind.dao.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wind/provider")
public class ProviderController {

    @Reference
    private DemoService demoService;

}
