package Ex3.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* Ex3.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint){
        logger.info("Method will execute");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            logger.info("Method failed");
        }
        logger.info("Method executed");
    }


}
