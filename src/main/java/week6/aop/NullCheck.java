package week6.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NullCheck {
    @Around("execution(* week6.service.*.*Null(..))")
    public Object SearchCheck(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = null;
        try{
            result = joinPoint.proceed();
        }
        catch (Exception e){
            System.out.println(joinPoint.getSignature().getName()+"에서 에러가 발생했습니다.");
            System.out.println("발생한 오류 : " + e);
        }
        finally {
        }
        return result;
    }
}
