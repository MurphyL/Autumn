package com.murphyl.autumn.core.support;

import com.murphyl.autumn.core.factory.AutumnBeanFactory;

/**
 * 运行时 - 上下文
 *
 * @date: 2021/5/13 11:20
 * @author: murph
 */
public interface AutumnContext extends MetaDetails {

    /**
     * Bean 构造工厂
     *
     * @return
     */
    AutumnBeanFactory getBeanFactory();

}
