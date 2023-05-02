package tn.esprit.farouk.skistation.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before("execution(public void tn.esprit.farouk.skistation.Services.*.* (..))")
    public void inMethod(JoinPoint joinPoint){
        log.info("in method : " + joinPoint.getSignature().getName());
    }
    @After("execution(public void tn.esprit.farouk.skistation.Services.*.* (..))")
    public void outMethod(JoinPoint joinPoint){
        log.info("in method : " + joinPoint.getSignature().getName());

    }
}
