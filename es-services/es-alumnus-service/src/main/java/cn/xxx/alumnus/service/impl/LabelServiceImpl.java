package cn.xxx.alumnus.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import cn.xxx.alumnus.mapper.LabelMapper;
import cn.xxx.alumnus.model.entity.Label;
import cn.xxx.alumnus.service.ILabelService;

/**
 * <p>
 * 校友标签表 服务实现类
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-10-25
 */
@Service
@Transactional(readOnly = true)
public class LabelServiceImpl extends ServiceImpl<LabelMapper, Label> implements ILabelService {

}
