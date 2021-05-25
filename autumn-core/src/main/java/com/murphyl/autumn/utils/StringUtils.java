package com.murphyl.autumn.utils;

import java.util.Objects;

/**
 * 字符串 - 工具类
 *
 * @date: 2021/5/13 14:28
 * @author: murph
 */
public final class StringUtils {

    public static String replace(final String text, final String searchString, final String replacement) {
        Objects.requireNonNull(text);
        if (isEmpty(text) || isEmpty(searchString) || replacement == null) {
            return text;
        }
        return null;
    }

    public static boolean isEmpty(final String text) {
        return null == text;
    }

}
