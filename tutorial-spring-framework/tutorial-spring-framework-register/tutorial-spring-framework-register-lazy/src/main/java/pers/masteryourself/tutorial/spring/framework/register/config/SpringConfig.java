package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import pers.masteryourself.tutorial.spring.framework.register.bean.Person;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 20:56
 */
@Configuration
public class SpringConfig {

    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean(name = "person")
    @Lazy
    public Person person() {
        return new Person();
    }

}
