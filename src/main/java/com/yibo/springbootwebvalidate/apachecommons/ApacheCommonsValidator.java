package com.yibo.springbootwebvalidate.apachecommons;

import org.apache.commons.validator.routines.IntegerValidator;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/25 16:02
 * @Description: Apache commons validator 的使用方式
 */
public class ApacheCommonsValidator {

    public static void main(String[] args) {
        IntegerValidator validator = new IntegerValidator();
        Integer value = validator.validate("10");
        System.out.println(value);

        value = validator.validate("A");
        System.out.println(value);
    }
}
