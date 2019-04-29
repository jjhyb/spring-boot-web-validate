package com.yibo.springbootwebvalidate.beanValidation.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.*;

/**
 * @author: wb-hyb441488
 * @Date: 2019/2/25 18:47
 * @Description:
 */

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {UserIdFormatCheckValidator.class}
)
public @interface UserIdFormatCheck {

    String message() default "{User ID is composed of numbers or letters}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    String value();

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        NotNull[] value();
    }
}
