package com.murphyl.autumn.core.annotation;

import java.lang.annotation.*;

/**
 * 注解
 *
 * @date: 2021/5/26 14:24
 * @author: murph
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    String value();

}
