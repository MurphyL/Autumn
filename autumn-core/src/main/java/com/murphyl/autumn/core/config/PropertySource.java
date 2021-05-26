package com.murphyl.autumn.core.config;

import java.lang.annotation.*;

/**
 * 配置 - 解析
 *
 * @date: 2021/5/26 10:04
 * @author: murph
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PropertySource {

    String[] value();

    String name() default "";

    String encoding() default "";

}
