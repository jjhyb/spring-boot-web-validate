package com.yibo.springbootwebvalidate.domain;

import com.yibo.springbootwebvalidate.beanValidation.annotation.UserIdFormatCheck;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/25 16:19
 * @Description:
 */
public class User {

    @NotNull
    @UserIdFormatCheck(value = "用户ID为字母和数字组成")
    private String id;

    @NotNull
    private String name;

    @Min(value = 16)
    @Max(value = 200,message = "用户的年龄不能小于16，且最大不能超过200")
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
