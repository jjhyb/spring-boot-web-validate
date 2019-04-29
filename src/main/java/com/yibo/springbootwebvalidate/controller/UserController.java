package com.yibo.springbootwebvalidate.controller;

import com.yibo.springbootwebvalidate.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/25 16:38
 * @Description:
 *
 * {@link User} controller
 */

@RestController
public class UserController {

    @PostMapping("/user/save")
    public User save(@Valid @RequestBody User user){
        return user;
    }
}
