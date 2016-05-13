package proxyEx;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	
	@Pointcut("execution(public * *(..))")
	public void pointCut(){}
	
	@Around("pointCut()")
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable{
		
		Signature s = joinPoint.getSignature();
		String methodName=s.getName();
		long startTime=System.nanoTime();
		System.err.println("[Log] METHOD Before: "+methodName+" time check start");
		
		Object obj = null;
		
		try{
			obj= joinPoint.proceed();
		}catch(Exception e){
			System.err.println("[Log]METHOD error: "+ methodName);
		}
		
		long endTime = System.nanoTime();
		System.err.println("[Log]METHOD After : "+methodName+" time check end");
		System.err.println("[Log]"+methodName+" Processing time is "+ (endTime-startTime)+"ns");
		
		return obj;
		
	}

}
