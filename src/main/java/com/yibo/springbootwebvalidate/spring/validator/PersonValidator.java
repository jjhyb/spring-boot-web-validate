package com.yibo.springbootwebvalidate.spring.validator;

import com.yibo.springbootwebvalidate.domain.User;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/25 16:21
 * @Description: spring validator 的使用方式
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        User user = User.class.cast(object);
        String name = user.getName();

        if(StringUtils.isEmpty(name)){
            errors.reject("person name cannot be empty","人的姓名不能为空");
        }
    }
}
