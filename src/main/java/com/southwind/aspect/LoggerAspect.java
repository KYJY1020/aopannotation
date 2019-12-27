package com.southwind.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {
@Before("execution(public int com.southwind.aop.CalImpl.*(..))")
public void before(JoinPoint joinPoint){
    String name=joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
    System.out.println(name+"的参数是："+args);
}
@AfterReturning(value="execution(public int com.southwind.aop.CalImpl.*(..))",returning ="result" )
public void after(JoinPoint joinPoint,Object result){
    String name=joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
    System.out.println(name+"的结果是："+result);



}
}
