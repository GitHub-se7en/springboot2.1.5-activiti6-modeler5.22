package com.java.boot2activiti6modeletogether0617;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"org.activiti","com"})
@SpringBootApplication(exclude = {org.activiti.spring.boot.SecurityAutoConfiguration.class,
        DruidDataSourceAutoConfigure.class,
        SecurityAutoConfiguration.class
})
public class Boot2Activiti6ModeleTogether0617Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot2Activiti6ModeleTogether0617Application.class, args);
    }

}
