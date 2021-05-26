package com.murphyl.autumn.boot;

import com.murphyl.autumn.boot.annotation.Config;
import com.murphyl.autumn.core.annotation.Service;
import com.murphyl.autumn.core.config.ConfigBundle;
import com.murphyl.autumn.core.config.PropertySource;
import com.murphyl.autumn.core.support.AutumnContext;
import org.reflections.Reflections;
import org.reflections.scanners.Scanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/**
 * 应用 - 门面
 *
 * @date: 2021/5/13 11:33
 * @author: murph
 */
public final class AutumnApplication {

    public static AutumnContext run(Class bootstrap, String... args) {
        Objects.requireNonNull(bootstrap);
        Scanner[] scanners = {new SubTypesScanner(false), new TypeAnnotationsScanner()};
        buildFrameworkContext(AutumnApplication.class.getPackage().getName(), scanners);
        buildApplicationContext(bootstrap.getPackage().getName(), scanners);
        return null;
    }

    private static void buildFrameworkContext(String packageName, Scanner[] scanners) {
        Reflections reflections = new Reflections(packageName, scanners);
        Set<Class<? extends Object>> configurations = reflections.getTypesAnnotatedWith(PropertySource.class);
        ConfigBundle bundle;
        for (Class<?> configuration : configurations) {
            bundle = new ConfigBundle(configuration.getAnnotation(PropertySource.class));
            System.out.println(bundle);
        }
    }

    private static void buildApplicationContext(String packageName, Scanner[] scanners) {
        Reflections reflections = new Reflections(packageName, scanners);
        Set<Class<? extends Object>> configurations = reflections.getTypesAnnotatedWith(Config.class);
        for (Class<?> configClass : configurations) {
            System.out.println(configClass);
        }
        Set<Class<? extends Object>> services = reflections.getTypesAnnotatedWith(Service.class);
        for (Class<?> serviceClass : services) {
            System.out.println(serviceClass);
        }
    }

}
