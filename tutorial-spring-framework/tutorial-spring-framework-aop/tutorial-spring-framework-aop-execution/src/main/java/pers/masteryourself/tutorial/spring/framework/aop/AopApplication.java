package pers.masteryourself.tutorial.spring.framework.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.aop.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.aop.service.PersonService;

/**
 * <p>description : AopApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 0:30
 */
public class AopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        personService.query("张三");
    }

}
