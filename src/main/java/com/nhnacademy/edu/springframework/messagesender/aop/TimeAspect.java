package com.nhnacademy.edu.springframework.messagesender.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimeAspect {

    @Pointcut("execution(public * * (..))")
    public void senderLayer() {}

//    @Around(value = "execution(* com.nhnacademy.edu.springframework.messagesender.* .* (..))")
    @Around("senderLayer()")
    public Object timeCheck(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();

        System.out.println("-----------------------------");
        stopWatch.start();

        Object proceed = proceedingJoinPoint.proceed();

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());

        return proceed;

    }

    @Before("senderLayer() && @annotation(auditable)")
    public void beforeAnnotattionTest(Auditable auditable) {
        System.out.println("============ Aspect Before Annotation Test ===============");
    }
}
