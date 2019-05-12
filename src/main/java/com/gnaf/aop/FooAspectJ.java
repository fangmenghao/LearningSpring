package com.gnaf.aop;

import org.aspectj.lang.annotation.*;

/**
 * @author Derek
 * @date 2019/5/12 9:04
 */
@Aspect
public class FooAspectJ {

    @Pointcut("execution(* com.gnaf.aop.Foo.*(..))")
    public void pointcut() {
    }

    @AfterReturning(value = "pointcut()", returning = "rn")
    public void afterReturning(Object rn) {
        System.out.println("AfterReturning: " + rn);
    }

}
