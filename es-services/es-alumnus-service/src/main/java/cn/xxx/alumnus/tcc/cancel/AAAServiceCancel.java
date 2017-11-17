package cn.xxx.alumnus.tcc.cancel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xxx.alumnus.service.ILabelService;
import cn.xxx.alumnus.tcc.ITCCAAAService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-07-05
 */
@Service("aaaServiceCancel")
public class AAAServiceCancel implements ITCCAAAService {
    @Autowired
    private ILabelService labelService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String test() {
        System.out.println("执行Cancel-----------------------------------");
        labelService.deleteById(10000L);
        return "Cancel";
    }
}
