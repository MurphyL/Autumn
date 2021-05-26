package com.murphyl.autumn.core.config;

import java.util.Properties;

/**
 * 配置 - 组
 *
 * @date: 2021/5/26 16:52
 * @author: murph
 */
public final class ConfigBundle {

    private final String name;

    private final Properties variables;

    public ConfigBundle(String name, String[] files) {
        this.name = name;
        this.variables = AutumnResource.readAll(files);
    }

    public ConfigBundle(PropertySource source) {
        this(source.name(), source.value());
    }

    public String getName() {
        return name;
    }

    public Properties getVariables() {
        return variables;
    }

    @Override
    public String toString() {
        return "ConfigBundle{name='" + name + "', variables=" + variables + '}';
    }
}
