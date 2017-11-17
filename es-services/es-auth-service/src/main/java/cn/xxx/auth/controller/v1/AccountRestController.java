package cn.xxx.auth.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xxx.auth.feginclient.v1.ApiAccountClient;
import cn.xxx.auth.model.entity.Account;
import cn.xxx.auth.tcc.ITCCBBBService;
import io.swagger.annotations.Api;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-07-05
 */
@Api(tags = {"Account"}, description = "账号操作相关接口")
@RestController
@RequestMapping("/v1/account")
public class AccountRestController implements ApiAccountClient {

    @Autowired
    @Qualifier("bbbServiceTry")
    private ITCCBBBService itccbbbService;

    @Override
    public Account test() {
        return itccbbbService.test();
    }


}