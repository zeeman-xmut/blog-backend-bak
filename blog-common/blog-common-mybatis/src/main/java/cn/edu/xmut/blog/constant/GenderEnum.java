package cn.edu.xmut.blog.constant;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Zeeman Zhang
 */
@AllArgsConstructor
@Getter
public enum GenderEnum {
    UNKNOWN(0, "未知"),
    MALE(1, "男"),
    FE_MALE(2, "女");

    @EnumValue @JsonValue private final int value;
    private final String desc;
}
