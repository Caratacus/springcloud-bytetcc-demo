package cn.xxx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import cn.xxx.api.gateway.filter.GateWayPreFilter;

/**
 * <p>
 * API 网关 启动类
 * </p>
 *
 * @author Caratacus
 * @Date 2017-02-12
 */
@EnableZuulProxy
@EnableFeignClients
@SpringCloudApplication
public class ApiGateWayApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGateWayApplication.class).web(true).run(args);
    }

    @Bean
    public GateWayPreFilter gateWayPreFilter() {
        return new GateWayPreFilter();
    }

}
