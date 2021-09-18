package com.openlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

    public static void main(String[] args) {
        System.out.print("git修改");
        SpringApplication.run(GitdemoApplication.class, args);
    }

    public void add(Integer Inid){
        System.out.println("添加用户success");
    }

}
