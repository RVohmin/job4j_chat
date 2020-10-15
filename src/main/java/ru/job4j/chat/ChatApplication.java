package ru.job4j.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ChatApplication {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    private static void getPass() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String pwd = encoder.encode("password");
        System.out.printf("Password for 'password': %s", pwd);
    }
    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
    }

}
