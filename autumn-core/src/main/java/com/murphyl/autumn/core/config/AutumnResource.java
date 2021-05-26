package com.murphyl.autumn.core.config;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Properties;

/**
 * 资源 - 数据
 *
 * @date: 2021/5/26 10:26
 * @author: murph
 */
public final class AutumnResource {

    public static Properties readAll(final String[] files) {
        Objects.requireNonNull(files, "文件路径不能为空");
        Properties payload = new Properties();
        Properties temp;
        for (String path : files) {
            temp = read(path);
            if (null == temp) {
                continue;
            }
            payload.putAll(temp);
        }
        return payload;
    }

    public static Properties read(final String path) {
        Objects.requireNonNull(path, "文件路径不能为空");
        if (ResourceProtocol.CLASSPATH.is(path)) {
            return ResourceProtocol.CLASSPATH.resolve(path);
        } else if (ResourceProtocol.FILE.is(path)) {
        }
        return null;
    }

    enum ResourceProtocol {
        CLASSPATH("classpath:"),
        FILE("file:"),
        ;

        private String prefix;

        ResourceProtocol(String prefix) {
            this.prefix = prefix;
        }

        public boolean is(String path) {
            return null != path && !path.trim().isEmpty() && path.trim().startsWith(prefix);
        }

        public Properties resolve(String path) {
            if (null == path) {
                return null;
            }
            String unique = path.substring(prefix.length());
            try {
                InputStream in = getClass().getClassLoader().getResourceAsStream(unique);
                if (null == in) {
                    return null;
                }
                Properties properties = new Properties();
                properties.load(in);
                return properties;
            } catch (Exception e) {
                throw new IllegalStateException("解析文件失败：", e);
            }
        }

    }

}
