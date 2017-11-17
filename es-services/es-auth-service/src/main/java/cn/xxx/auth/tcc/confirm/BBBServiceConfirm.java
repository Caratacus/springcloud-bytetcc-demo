package cn.xxx.auth.tcc.confirm;

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
@Service("bbbServiceConfirm")
public class BBBServiceConfirm implements ITCCBBBService {

    @Autowired
    private IAccountService accountService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Account test() {
        System.out.println("执行Confirm-----------------------------------");
        Account account =null;
        account = new Account();
        account.setUid(10001L);
        account.setLoginName("10001L");
        account.setStatus(0);
        account.setSourceType("P");
        accountService.insert(account);
        return account;
    }
}
