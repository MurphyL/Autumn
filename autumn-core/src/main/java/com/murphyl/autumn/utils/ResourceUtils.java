package com.murphyl.autumn.utils;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.function.Function;

/**
 * 资源 - 工具类
 *
 * @date: 2021/5/13 12:43
 * @author: murph
 */
public final class ResourceUtils {

    private final static Function<String[], File[]> LOCATION_FILE_CONVERTER = (locations) -> {
        File[] result = new File[locations.length];
        for (int i = 0; i < locations.length; i++) {
            result[i] = new File(locations[i]);
        }
        return result;
    };

    public static File[] list(String root) {
        URL url = ResourceUtils.class.getResource(root);
        File file = null;
        try {
            file = new File(url.toURI());
        } catch (URISyntaxException e) {
            file = new File(url.getPath());
        } finally {
            return LOCATION_FILE_CONVERTER.apply(file.list());
        }
    }

    public static File get(String root) {
        URL url = ResourceUtils.class.getResource(root);
        try {
            return new File(url.toURI());
        } catch (URISyntaxException e) {
            return new File(url.getPath());
        }
    }

    public static File[] read(String root) {
        File[] roots = list(root);
        return roots;
    }

    public static File[] readPackage(Package root) {
        return new File[0];
    }

}
