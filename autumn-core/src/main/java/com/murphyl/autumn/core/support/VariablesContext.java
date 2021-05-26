package com.murphyl.autumn.core.support;

import java.util.Properties;

/**
 * 数据 - 上下文
 *
 * @date: 2021/5/26 14:54
 * @author: murph
 */
public final class VariablesContext {

    private final Properties valuables;

    public VariablesContext() {
        this.valuables = new Properties();
    }

    public void append(final Properties values) {
        this.valuables.putAll(values);
    }
}
