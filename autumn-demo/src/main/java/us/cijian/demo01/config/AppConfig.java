package us.cijian.demo01.config;

import com.murphyl.autumn.core.annotation.Bean;
import com.murphyl.autumn.boot.annotation.Config;

/**
 * APP - Config
 *
 * @date: 2021/5/25 21:21
 * @author: murph
 */
@Config
public class AppConfig {

    @Bean
    public Object testBean() {
        return new Object();
    }

}
