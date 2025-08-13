package com.example.sslbundle;

import org.springframework.boot.SpringApplication;

public class TestSslBundleApplication {

    public static void main(String[] args) {
        SpringApplication.from(SslBundleApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
