package com.xiaojian.nettydemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaojian
 * @description 測試接口
 * @date 2018/10/16
 */
@RestController
public class TestController {

    @RequestMapping(value = "test")
    public Object getTest() {
        String message = "這是測試接口";
        System.out.println("==========這是測試接口");
        return message;
    }
}
