package week6.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimeCheck {
    @Around("execution(* week6.service.*.*Search(..))")
    public Object Check(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch("MeasureTime");
        Object result = null;
        try{
            stopWatch.start();
            result = joinPoint.proceed();
        }
        finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
        return result;
    }
}
