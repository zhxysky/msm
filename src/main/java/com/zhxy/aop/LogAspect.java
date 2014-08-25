package com.zhxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 定义切面
 * @author zhxy
 *
 */

@Component
@Aspect
public class LogAspect {

	@After("execution(* com.zhxy.service.*.*(..))")
	public void doAfter(JoinPoint jp) {
		System.out.println("do after method:" + jp.getTarget().getClass().getName() + "."
				+ jp.getSignature().getName());
	}

	@Around("execution(* com.zhxy.service.*.*(..))")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		long time = System.currentTimeMillis();
		Object retval = pjp.proceed();
		time = System.currentTimeMillis() - time;
		System.out.println("process time :" + time + " ms.");
		System.out.println();
		return retval;
	}

	@Before("execution(* com.zhxy.service.*.*(..))")
	public void doBefore(JoinPoint jp) {
		System.out.println("do before method:" + jp.getTarget().getClass().getName() + "."
				+ jp.getSignature().getName());
	}

	public void doThrowing(JoinPoint jp, Throwable ex) {
		System.out.println("method " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName()
				+ " throw exception");
		System.out.println(ex.getMessage());

	}
	
}
