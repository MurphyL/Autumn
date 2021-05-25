package com.murphyl.autumn;

import com.murphyl.autumn.core.annotation.Configuration;
import com.murphyl.autumn.core.annotation.Service;
import com.murphyl.autumn.support.AutumnRuntime;
import org.reflections.Reflections;
import org.reflections.scanners.Scanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.util.Objects;
import java.util.Set;

/**
 * 应用 - 门面
 *
 * @date: 2021/5/13 11:33
 * @author: murph
 */
public final class AutumnApplication {

    public static AutumnRuntime run(Class bootstrap, String... args) {
        Objects.requireNonNull(bootstrap);
        Scanner[] scanners = { new SubTypesScanner(false), new TypeAnnotationsScanner() };
        Reflections reflections = new Reflections(bootstrap.getPackage().getName(), scanners);
        Set<Class<? extends Object>> configurations = reflections.getTypesAnnotatedWith(Configuration.class);
        for (Class<?> configClass : configurations) {
            System.out.println(configClass);
        }
        Set<Class<? extends Object>> services = reflections.getTypesAnnotatedWith(Service.class);
        for (Class<?> serviceClass : services) {
            System.out.println(serviceClass);
        }
        return null;
    }

}