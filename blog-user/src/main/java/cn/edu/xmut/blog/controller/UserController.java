package cn.edu.xmut.blog.controller;

import cn.edu.xmut.blog.dto.UserDTO;
import cn.edu.xmut.blog.entity.RestResult;
import cn.edu.xmut.blog.service.impl.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author Zeeman Zhang
 */
@RestController
@RequestMapping("/")
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public RestResult<Void> signUp(@RequestBody @Validated UserDTO userDTO) {
        userService.saveUser(userDTO);
        return RestResult.ok("注册成功");
    }
}
