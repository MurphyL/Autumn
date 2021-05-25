package com.murphyl.autumn.proxy;

import com.murphyl.autumn.proxy.cglib.CglibProxy;
import com.murphyl.autumn.proxy.jvm.JavaProxy;

/**
 * 动态代理 - 门面
 *
 * @date: 2021/5/13 14:05
 * @author: murph
 */
public interface DynamicProxy {

    /**
     * 构造代理实例
     *
     * @param tClass
     * @param <T>
     * @return
     */
    static <T> DynamicProxy getInstance(Class<T> tClass) {
        return tClass.isInterface() ? new CglibProxy() : new JavaProxy();
    }

}
