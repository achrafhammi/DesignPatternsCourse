package achraf.aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class SecondAspect {
    @Pointcut("execution(* achraf.metier.*.*(..))")
    public void pc2() {
    }

//    @Before("pc2()")
//    public void beforeMain() {
//        System.out.println("Before main **********");
//    }
//
//    @After("pc2()")
//    public void afterMain() {
//        System.out.println("After main **********");
//    }

    @Around("pc2()")
    public Object aroundMain(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around main **********");
        try {
            return pjp.proceed();
        } finally {
            System.out.println("Around main **********");
        }
    }
}