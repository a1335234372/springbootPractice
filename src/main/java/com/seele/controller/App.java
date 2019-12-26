package com.seele.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// 注解表示开启自动化配置
//@EnableAutoConfiguration
////注解表示默认扫描包
//@ComponentScan
@SpringBootApplication
public class App {

    public static  void main(String[] args){
        // 启动项目
        SpringApplication.run(App.class,args);
    }
}
