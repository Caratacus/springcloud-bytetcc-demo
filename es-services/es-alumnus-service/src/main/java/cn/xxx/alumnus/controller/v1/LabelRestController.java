package cn.xxx.alumnus.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xxx.alumnus.feginclient.v1.ApiLabelClient;
import cn.xxx.alumnus.tcc.ITCCAAAService;

/**
 * <p>
 * 校友标签表 前端控制器
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-10-25
 */
@RestController
@RequestMapping("/v1/label")
public class LabelRestController implements ApiLabelClient {

    @Autowired
    @Qualifier("aaaServiceTry")
    private ITCCAAAService itccaaaService;

    @GetMapping("/test")
    public String test() {
        return itccaaaService.test();
    }
}