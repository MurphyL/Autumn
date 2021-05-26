package com.murphyl.autumn.boot.support;

import com.murphyl.autumn.core.config.PropertySource;

/**
 * 引导 - 配置信息
 *
 * @date: 2021/5/26 10:15
 * @author: murph
 */
@PropertySource(value = {"classpath:META-INF/autumn/autumn-bootstrap.properties", "classpath:bootstrap.properties"}, name = "bootstrap.properties")
public final class BootstrapProperties {
}
