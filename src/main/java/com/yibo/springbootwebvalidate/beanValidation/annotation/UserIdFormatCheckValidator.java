package com.yibo.springbootwebvalidate.beanValidation.annotation;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/25 18:52
 * @Description:
 */

/**
 * 自定义注解UserIdFormatCheck 的实现类
 * 用于判断User对象中的id属性的格式，规定id字符串由字母(包含大小写)、数字组成
 */
public class UserIdFormatCheckValidator implements ConstraintValidator<UserIdFormatCheck,String> {

    private String value;

    @Override
    public void initialize(UserIdFormatCheck constraintAnnotation) {
        //传入value 值，可以在校验中使用
        this.value = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(StringUtils.isEmpty(value)){
            return false;
        }
        for (char ch : value.toCharArray()) {
            if((ch >= 'A' && ch <= 'Z')){
                continue;
            }else if((ch >= 'a' && ch <= 'z')){
                continue;
            }else if((ch >= '0' && ch <= '9')){
                continue;
            }else {
                context.disableDefaultConstraintViolation();
                ConstraintValidatorContext.ConstraintViolationBuilder builder =
                        context.buildConstraintViolationWithTemplate("用户ID格式由字母和数字组成");
                //这里的字符串可以从数据库中获取，且会替代校验字段上的字符串
                builder.addConstraintViolation();
                return false;
            }
        }
        return true;
    }
}
