package cn.xxx.auth.model.entity;

import com.baomidou.mybatisplus.annotations.TableId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author Mybatis Plus
 * @since 2017-07-05
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Account {

    /**
     * 禁用
     */
    public static final int FORBIDDEN_STATUS = 1;
    /**
     * 启用
     */
    public static final int NOMAL_STATUS = 0;
    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    @TableId
    private Long uid;
    /**
     * 登陆名
     */
    private String loginName;
    /**
     * 状态,0:启用;1:禁用
     */
    private Integer status;
    /**
     * 来源:A:安卓,I:IOS,P:PC
     */
    private String sourceType;

    public enum SourceType {

        ANDROID(1, "A"),
        IOS(2, "I"),
        PC(3, "P");

        private final Integer code;
        private final String desc;

        SourceType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public static SourceType getEnum(Integer code) {
            if (null != code) {
                SourceType[] sourceTypes = SourceType.values();
                for (SourceType sourceType : sourceTypes) {
                    if (sourceType.code().equals(code)) {
                        return sourceType;
                    }
                }
            }
            throw new RuntimeException("Error: Unknown sourceType!\n");
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }
    }
}
