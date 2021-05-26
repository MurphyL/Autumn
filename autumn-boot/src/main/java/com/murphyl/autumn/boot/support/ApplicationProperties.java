package com.murphyl.autumn.boot.support;

import com.murphyl.autumn.core.config.PropertySource;

/**
 * 引用 - 配置信息
 *
 * @date: 2021/5/26 10:15
 * @author: murph
 */
@PropertySource(value = {"classpath:META-INF/autumn/autumn-application.properties", "classpath:autumn.properties"}, name = "autumn.properties")
public final class ApplicationProperties {
}
