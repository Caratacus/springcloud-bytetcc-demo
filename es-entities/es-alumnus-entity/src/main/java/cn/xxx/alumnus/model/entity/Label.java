package cn.xxx.alumnus.model.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 校友标签表
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-10-25
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Label{

    private static final long serialVersionUID = 1L;
    private Long id;
    @ApiModelProperty(notes = "行业名称", dataType = "String")
    private String name;
    @ApiModelProperty(notes = "兴趣分类1:生活2:工作3:校园4:行业", dataType = "Integer")
    private Integer labelType;

}
