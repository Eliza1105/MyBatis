package org.itstep;

import org.apache.ibatis.type.MappedTypes;
import org.itstep.model.Student;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@MappedTypes({Student.class})
public class RoledemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(RoledemoApplication.class, args);
    }
}