package com.jiaqi.projecttrack;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiaqi.projecttrack.mapper")
public class ProjecttrackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjecttrackApplication.class, args);
    }
}
