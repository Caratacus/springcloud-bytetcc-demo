package cn.xxx.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * RESTful 服务 API 管理框架 Swagger 配置初始化 <br>
 * </p>
 *
 * @author Caratacus
 * @since 2017-09-21
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        ApiSelectorBuilder asb = (new Docket(DocumentationType.SWAGGER_2)).select();
        asb.apis(RequestHandlerSelectors.basePackage("cn.xxx.auth.controller"));
        asb.paths(PathSelectors.any());
        return asb.build().useDefaultResponseMessages(false);
    }

}
