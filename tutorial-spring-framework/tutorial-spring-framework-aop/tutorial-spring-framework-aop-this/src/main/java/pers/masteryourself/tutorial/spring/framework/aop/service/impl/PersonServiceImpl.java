package pers.masteryourself.tutorial.spring.framework.aop.service.impl;

import org.springframework.stereotype.Service;
import pers.masteryourself.tutorial.spring.framework.aop.service.PersonService;

/**
 * <p>description : PersonServiceImpl
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 1:25
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public void query(String name) {
        System.out.println("执行 query()");
    }

    @Override
    public void save(String name) {
        System.out.println("执行 save()");
    }

}
