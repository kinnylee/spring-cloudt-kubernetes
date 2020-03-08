package com.kinnylee.eurekaserverkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerKubernetesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerKubernetesApplication.class, args);
    }

}
