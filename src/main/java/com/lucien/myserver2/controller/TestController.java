package com.lucien.myserver2.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author huoershuai
 * @Date 2020/6/19
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name) {
        if (!StringUtils.isNotBlank(name)) {
            name = "无名侠";
        }
        return "hello, " + name;
    }
}
