package cn.xxx.auth.tcc.cancel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xxx.auth.model.entity.Account;
import cn.xxx.auth.service.IAccountService;
import cn.xxx.auth.tcc.ITCCBBBService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-07-05
 */
@Service("bbbServiceCancel")
public class BBBServiceCancel implements ITCCBBBService {

    @Autowired
    private IAccountService accountService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Account test() {
        System.out.println("执行Cancel-----------------------------------");
        accountService.deleteById(10000L);
        return null;
    }
}
