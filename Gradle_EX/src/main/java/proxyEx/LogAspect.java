package proxyEx;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Pointcut("execution(public * sayHello(..))")
	public void pointCut1(){}
	
	@Before("pointCut1()")
	public void beforeLogging(){
		System.out.println("�޼��� ȣ�� ��");
	}
	@AfterReturning(pointcut="pointCut1()", returning="returnValue")
	public void afterLogging(Object returnValue){
		System.out.println("�޼��� ȣ�� ��");
		System.out.println("���ϰ��� : "+returnValue);
	}
	@AfterThrowing(pointcut="pointCut1()",throwing="ex")
	public void throwingLogging(Exception ex) throws Exception{
		System.out.println("���� �߻� : "+ex.getMessage()+";");
	}
	@After("pointCut1()")
	public void alwaysLogging(){
		System.out.println("�׻����");
	}
}
