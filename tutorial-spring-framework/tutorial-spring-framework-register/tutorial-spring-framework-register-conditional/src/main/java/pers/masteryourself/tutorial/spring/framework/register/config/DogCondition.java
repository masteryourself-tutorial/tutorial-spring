package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDateTime;

/**
 * <p>description : DogCondition
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:01
 */
public class DogCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        return hour > 6 && hour < 18;
    }

}
