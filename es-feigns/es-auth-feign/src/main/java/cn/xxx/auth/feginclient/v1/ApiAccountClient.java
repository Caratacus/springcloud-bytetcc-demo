package cn.xxx.auth.feginclient.v1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cn.xxx.auth.model.entity.Account;

/**
 * base模块-账号
 */
@FeignClient(name = "es-auth-service", path = "/v1/account")
public interface ApiAccountClient {

    @GetMapping(value = "/test")
    Account test();

}