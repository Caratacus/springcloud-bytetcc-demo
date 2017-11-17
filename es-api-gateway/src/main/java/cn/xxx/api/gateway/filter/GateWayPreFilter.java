package cn.xxx.api.gateway.filter;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 网关中心过滤器
 * </p>
 *
 * @author Caratacus
 * @see org.springframework.cloud.netflix.zuul.filters.pre.DebugFilter
 * @see org.springframework.cloud.netflix.zuul.filters.pre.FormBodyWrapperFilter
 * @since 2017-06-06
 */
@Slf4j
public class GateWayPreFilter extends ZuulFilter {

    /**
     * (1) PRE：这种过滤器在请求被路由之前调用。我们可利用这种过滤器实现身份验证、在集群中选择请求的微服务、记录调试信息等。
     * (2) ROUTING：这种过滤器将请求路由到微服务。这种过滤器用于构建发送给微服务的请求，并使用Apache HttpClient或Netfilx Ribbon请求微服务。
     * (3) POST：这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准的HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等。
     * (4) ERROR：在其他阶段发生错误时执行该过滤器。
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否过滤,可以根据请求来判断是否执行
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("{} request to {}", request.getMethod(), request.getRequestURL().toString());
        return null;
    }

}