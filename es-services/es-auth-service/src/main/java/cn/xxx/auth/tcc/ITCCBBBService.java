package cn.xxx.auth.tcc;

import cn.xxx.auth.model.entity.Account;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-07-05
 */
public interface ITCCBBBService {

    /**
     * 注册账号
     *
     * @param appId
     * @param loginName 用户名
     * @param password  密码
     * @param code      验证码
     * @param platform  平台
     * @return
     */
    Account test();

}
