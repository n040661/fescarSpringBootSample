package com.hcsoc.account.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource({"classpath:account-provider.xml"})
public class AccountBootStrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AccountBootStrap.class).run(args);
    }
}
