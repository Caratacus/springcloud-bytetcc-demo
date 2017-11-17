package cn.xxx.auth.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import cn.xxx.auth.mapper.AccountMapper;
import cn.xxx.auth.model.entity.Account;
import cn.xxx.auth.service.IAccountService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-07-05
 */
@Service
@Transactional(readOnly = true)
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
