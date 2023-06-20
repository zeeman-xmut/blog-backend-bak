package cn.edu.xmut.blog.dto;

import cn.edu.xmut.blog.constant.GenderEnum;
import cn.edu.xmut.blog.entity.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author Zeeman Zhang
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends BaseDTO {

    @Email private String email;

    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,16}$",
            message = "密码长度要求在 8-16 位之间，并且至少包含一位大写字母、一位小写字母和一位数字")
    private String password;

    private String avatar;

    @NotBlank(message = "昵称不能为空")
    private String nickname;

    private GenderEnum gender = GenderEnum.UNKNOWN;
}
