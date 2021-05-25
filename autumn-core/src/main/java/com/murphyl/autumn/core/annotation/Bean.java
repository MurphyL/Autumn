package com.murphyl.autumn.core.annotation;

import java.lang.annotation.*;

/**
 * Bean
 *
 * @date: 2021/5/25 21:26
 * @author: murph
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Bean {
}
