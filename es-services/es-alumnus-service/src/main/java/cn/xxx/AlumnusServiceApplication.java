package cn.xxx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication
@EnableCaching
public class AlumnusServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AlumnusServiceApplication.class).web(true).run(args);
    }

}