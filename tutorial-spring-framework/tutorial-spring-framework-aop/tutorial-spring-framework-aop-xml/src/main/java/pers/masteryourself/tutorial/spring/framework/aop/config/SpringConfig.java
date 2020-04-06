package pers.masteryourself.tutorial.spring.framework.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 0:30
 */
@Configuration
@ComponentScan(value = "pers.masteryourself.tutorial.spring.framework.aop")
@ImportResource("classpath:spring.xml")
public class SpringConfig {

}
