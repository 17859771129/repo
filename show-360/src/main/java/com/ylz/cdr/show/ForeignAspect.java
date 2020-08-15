package com.ylz.cdr.show;

import net.sf.json.JSONArray;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

/*@Aspect
@Service*/
public class ForeignAspect {
    /**
     * @param jointPoint-连接点对象：封装了(特定)具体业务的方法信息
     * @return
     * @throws Throwable
     * @Around 描述的方法为一个环绕通知
     * 环绕通知:目标方法执行之前和之后都可以执行
     * 环绕通知内部的bean表达式为一个切入点表达-扩展功能在哪个点进行切入，什么时候加扩展功能，在什么位置加功能？
     */
    @Around("execution(public String com.ylz.cdr.show.controller.foreign.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint jointPoint) throws Throwable {
        Object[] args = jointPoint.getArgs();
        System.out.println(JSONArray.fromObject(args));
        Object result = jointPoint.proceed();
        return result;
    }
}
