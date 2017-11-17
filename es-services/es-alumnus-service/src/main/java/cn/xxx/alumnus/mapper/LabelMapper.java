package cn.xxx.alumnus.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import cn.xxx.alumnus.model.entity.Label;

/**
 * <p>
 * 校友标签表 Mapper 接口
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-10-25
 */
public interface LabelMapper extends BaseMapper<Label> {

    /**
     * 获取指定校友选择的兴趣标签
     *
     * @param uid
     * @return
     */
    List<Label> getLabelsByUid(@Param("uid") Long uid);
}