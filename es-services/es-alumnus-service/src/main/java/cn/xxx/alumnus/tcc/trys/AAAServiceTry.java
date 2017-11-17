package cn.xxx.alumnus.tcc.trys;

import org.bytesoft.compensable.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xxx.alumnus.model.entity.Label;
import cn.xxx.alumnus.service.ILabelService;
import cn.xxx.alumnus.tcc.ITCCAAAService;
import cn.xxx.auth.feginclient.v1.ApiAccountClient;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-07-05
 */
@Compensable(interfaceClass = ITCCAAAService.class, confirmableKey = "aaaServiceConfirm", cancellableKey = "aaaServiceCancel")
@Service("aaaServiceTry")
public class AAAServiceTry implements ITCCAAAService{

    @Autowired
    private ILabelService labelService;
    @Autowired
    private ApiAccountClient accountClient;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public String test() {
        System.out.println("执行try-----------------------------------");
        Label label = new Label();
        label.setId(10000L);
        label.setLabelType(10);
        label.setName("10000L");
        labelService.insert(label);
       accountClient.test();
       throw new RuntimeException("11111111");
    }
}
