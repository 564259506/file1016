package cn.wxc.springcloud_confignacos_client3377;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class SpringcloudConfigNacosClient3377Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigNacosClient3377Application.class, args);
    }

}
