package cn.edu.xmut.blog.service;

import cn.edu.xmut.blog.domain.AccountDO;
import cn.edu.xmut.blog.dto.UserDTO;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author Zeeman Zhang
 */
public interface AccountService extends IService<AccountDO> {

    /**
     * @param userDTO 待添加的新用户信息
     * @return 用户 ID
     */
    Long saveAccount(UserDTO userDTO);
}
