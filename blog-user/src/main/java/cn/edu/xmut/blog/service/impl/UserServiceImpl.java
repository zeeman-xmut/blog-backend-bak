package cn.edu.xmut.blog.service.impl;

import cn.edu.xmut.blog.domain.UserDO;
import cn.edu.xmut.blog.dto.UserDTO;
import cn.edu.xmut.blog.mapper.UserMapper;
import cn.edu.xmut.blog.service.UserService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Zeeman Zhang
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    private final AccountServiceImpl accountService;

    @Autowired
    public UserServiceImpl(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @Override
    public void saveUser(UserDTO userDTO) {
        Long id = accountService.saveAccount(userDTO);
        UserDO user = new UserDO();
        user.setId(id);
        user.setEmail(userDTO.getEmail());
        user.setAvatar(userDTO.getAvatar());
        user.setNickname(userDTO.getNickname());
        user.setGender(userDTO.getGender());
        this.save(user);
    }
}
