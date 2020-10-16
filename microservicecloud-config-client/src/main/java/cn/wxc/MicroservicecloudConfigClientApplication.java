package cn.wxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicecloudConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigClientApplication.class, args);
    }

}
