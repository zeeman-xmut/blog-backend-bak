package cn.edu.xmut.blog.domain;

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
@TableName("t_account")
public class AccountDO extends BaseDO {

    @TableField("email")
    private String email;

    @TableField("password")
    private String password;
}
