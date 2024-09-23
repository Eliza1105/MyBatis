package org.itstep;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("src/main/java/org/itstep/repository/StudentMapper.java")
public class RoledemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoledemoApplication.class, args);
    }
}