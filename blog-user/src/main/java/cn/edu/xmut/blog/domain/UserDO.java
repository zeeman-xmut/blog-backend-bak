package cn.edu.xmut.blog.domain;

import cn.edu.xmut.blog.constant.GenderEnum;
import cn.edu.xmut.blog.entity.BaseDO;

import com.baomidou.mybatisplus.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Zeeman Zhang
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_user")
public class UserDO extends BaseDO {

    @TableField("email")
    private String email;

    @TableField("avatar")
    private String avatar;

    @TableField("nickname")
    private String nickname;

    @TableField("gender")
    private GenderEnum gender;
}
