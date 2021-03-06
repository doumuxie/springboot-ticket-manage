package com.doumuxie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author doumuxie
 * @version 1.0
 * @date 2020/2/7 11:05
 * @description 启动类
 **/
@SpringBootApplication
@MapperScan("com.doumuxie.mapper")
public class StartApplication {


    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
