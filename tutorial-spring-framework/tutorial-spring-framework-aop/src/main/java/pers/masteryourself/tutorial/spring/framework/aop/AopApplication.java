package pers.masteryourself.tutorial.spring.framework.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.aop.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.aop.service.PersonService;
import pers.masteryourself.tutorial.spring.framework.aop.service.impl.PersonServiceImpl;

import java.lang.reflect.Proxy;

/**
 * <p>description : AopApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:51
 */
public class AopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        // The method query begins with [张三]
        // The method query ends with result is 张三 query finish
        // The method query ends
        // result is 张三 query finish
        System.out.println(personService.query("张三"));
        // true
        // spring 默认使用 jdk 动态代理，所以 personService 继承了 Proxy 接口
        System.out.println(personService instanceof Proxy);
        // false
        // java 是单继承的，代理类并不是 PersonServiceImpl 的子类
        System.out.println(personService instanceof PersonServiceImpl);
    }

}
