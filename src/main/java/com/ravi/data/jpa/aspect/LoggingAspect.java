package com.ravi.data.jpa.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(public com.ravi.data.jpa.domain.Hotel com.ravi.data.jpa.api.HotelApi.getHotel(..))")
    public void loggingPointCut(JoinPoint joinPoint) {


        System.out.println("Logging necessary information:" + Arrays.toString(joinPoint.getArgs()));
    }
}
