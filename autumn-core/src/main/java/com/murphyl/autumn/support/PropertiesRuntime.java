package com.murphyl.autumn.support;

import java.util.Properties;

/**
 * Properties 文件 - 运行时上下文
 *
 * @date: 2021/5/13 13:55
 * @author: murph
 */
public interface PropertiesRuntime extends JavaConfigRuntime {

    /**
     * 获取配置
     *
     * @return
     */
    Properties getProperties();

}
