package com.zzf.config.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/3/5
 * @time: 19:30
 * @description : do some thing
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientConsumerApplication.class, args);
    }
}
