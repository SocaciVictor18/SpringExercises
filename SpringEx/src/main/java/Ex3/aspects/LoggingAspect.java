package Ex3.aspects;

import Ex3.model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Logging Aspect: Method executed and returned " +
                returnedValue);

        return returnedValue;
    }

//    @AfterReturning(value = "@annotation(ToLog)",
//    returning = "returnedValue")
//    public void log(Object returnedValue) {
//        logger.info("Method executed and returned " + returnedValue);
//    }
//    @Around("@annotation(ToLog)")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        Object [] arguments = joinPoint.getArgs();
//
//        logger.info("Method " + methodName +
//                " with parameters " + Arrays.asList(arguments) +
//                " will execute");
//
//        Object returnedByMethod = joinPoint.proceed();
//
//        logger.info("Method executed and returned " + returnedByMethod);
//
//        return returnedByMethod;
//    }

//    @Around("@annotation(Ex3.aspects.ToLog)")
//    public Object log (ProceedingJoinPoint joinPoint) throws Throwable {
//        logger.info("Logging Aspect: Calling the intercepted method");
//        Object returnedValue = joinPoint.proceed();
//        logger.info("Logging Aspect: Method executed and returned " + returnedValue);
//        return returnedValue;
//    }
//    @Around("execution(* Ex3.services.*.*(..))")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        Object [] arguments = joinPoint.getArgs();
//
//
//        logger.info("Method " + methodName +
//                " with parameters " + Arrays.asList(arguments) +
//                " will execute");
//
//        Comment comment = new Comment();
//        comment.setText("Some other text!");
//        Object [] newArguments = {comment};
//
//        Object returnedByMethod = joinPoint.proceed(newArguments);
//
//        logger.info("Method executed and returned " + returnedByMethod);
//
//        return "FAILED";
//    }

//    @Around("execution(* Ex3.services.*.*(..))")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName =
//        joinPoint.getSignature().getName();
//        Object [] arguments = joinPoint.getArgs();
//
//        logger.info("Method " + methodName +
//                " with parameters " + Arrays.asList(arguments) +
//                        " will execute");
//
//        Object returnedByMethod = joinPoint.proceed();
//
//        logger.info("Method executed and returned " + returnedByMethod);
//
//        return returnedByMethod;
//    }
//    @Around("execution(* Ex3.services.*.*(..))")
//    public void log(ProceedingJoinPoint joinPoint){
//        logger.info("Method will execute");
//        try {
//            joinPoint.proceed();
//        } catch (Throwable e) {
//            logger.info("Method failed");
//        }
//        logger.info("Method executed");
//    }


}
