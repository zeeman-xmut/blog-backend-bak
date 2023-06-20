package cn.edu.xmut.blog.service;

import cn.edu.xmut.blog.domain.UserDO;
import cn.edu.xmut.blog.dto.UserDTO;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author Zeeman Zhang
 */
public interface UserService extends IService<UserDO> {

    /**
     * @param userDTO 待添加的新用户信息
     */
    void saveUser(UserDTO userDTO);
}
