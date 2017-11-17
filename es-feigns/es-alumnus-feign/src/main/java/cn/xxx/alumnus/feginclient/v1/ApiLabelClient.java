package cn.xxx.alumnus.feginclient.v1;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * <p>
 * 校友标签表 Client
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-10-25
 */
@FeignClient(name = "es-alumnus-service", path = "/v1/label")
public interface ApiLabelClient {

}