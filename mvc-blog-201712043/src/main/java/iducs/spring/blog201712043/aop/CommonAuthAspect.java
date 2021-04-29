package iducs.spring.blog201712043.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import iducs.spring.blog201712043.domain.Blog;

@Aspect
@Component
public class CommonAuthAspect {
	Logger logger= LoggerFactory.getLogger(CommonAuthAspect.class);
	
	@Pointcut("execution(* iducs.spring.blog201712043..*ServiceImpl.*(..))" + "&& args(n, b)")
	public void createBlog(int n, Blog b) {}
	
	@Around("createBlog(n, b)")
	public Object logging(ProceedingJoinPoint pjp, int n, Blog b) throws Throwable {
	logger.info("before : " + pjp.getSignature().getDeclaringTypeName() + " : " + pjp.getSignature().getName());
	Object result = pjp.proceed();
	logger.info("after : " + pjp.getSignature().getDeclaringTypeName() + " : " + pjp.getSignature().getName());
	return result;
	}

}
