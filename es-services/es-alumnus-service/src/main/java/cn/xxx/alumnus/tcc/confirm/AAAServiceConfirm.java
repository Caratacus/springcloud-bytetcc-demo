package cn.xxx.alumnus.tcc.confirm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.xxx.alumnus.model.entity.Label;
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
@Service("aaaServiceConfirm")
public class AAAServiceConfirm implements ITCCAAAService {
    @Autowired
    private ILabelService labelService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String test() {
        System.out.println("执行Confirm-----------------------------------");
        Label label = new Label();
        label.setId(10001L);
        label.setLabelType(10);
        label.setName("10001L");
        labelService.insert(label);
        return "confirm";
    }
}
