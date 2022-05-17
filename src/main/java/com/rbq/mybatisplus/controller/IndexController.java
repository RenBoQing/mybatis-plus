package com.rbq.mybatisplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RenBoQing&HuHanYue
 * @date 2022年05月10日 9:22
 * @Description 测试Controller
 */
@RestController
public class IndexController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("测试数据");
        System.out.println("测试数据测试仪");
        System.out.println("测试数据很好言");
        return "Hello World";
    }
}
