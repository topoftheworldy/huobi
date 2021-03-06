package com.cn.yc;

import com.cn.yc.service.QqRoobotService;
import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by DT167 on 2017/6/2.
 */

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
//@ComponentScan(basePackages={"**.*.service","**.*.service.impl","**.*.controller","**.*.ws","**.*.springboot"})
public class Startup extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    @Autowired
    private QqRoobotService qqRoobotService ;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Startup.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application;
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(80);
    }
}
