package com.zaien.xaien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ZaienApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaienApplication.class, args);
    }

}
