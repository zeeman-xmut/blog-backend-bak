package cn.edu.xmut.blog.service.impl;

import cn.edu.xmut.blog.domain.AccountDO;
import cn.edu.xmut.blog.dto.UserDTO;
import cn.edu.xmut.blog.mapper.AccountMapper;
import cn.edu.xmut.blog.service.AccountService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

/**
 * @author Zeeman Zhang
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountDO>
        implements AccountService {

    @Override
    public Long saveAccount(UserDTO userDTO) {
        AccountDO account = new AccountDO();
        account.setEmail(userDTO.getEmail());
        account.setPassword(BCrypt.hashpw(userDTO.getPassword(), BCrypt.gensalt()));
        this.save(account);
        return account.getId();
    }
}
