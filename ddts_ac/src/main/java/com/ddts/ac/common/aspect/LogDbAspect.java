package com.ddts.ac.common.aspect;

import java.lang.reflect.Method;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ddts.ac.common.LogAnnotation;
import com.ddts.ac.model.Employee;
import com.ddts.ac.model.Log;
import com.ddts.ac.service.LogService;

@Component
@Aspect
public class LogDbAspect
{
	@Autowired
	private LogService service;

	@Around("@annotation(ccom.ddts.ac.common.Annotation)")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable
	{
		// 1- processing before method execution, equivalent to pre-notification
		MethodSignature method_name = (MethodSignature) pjp.getSignature(); // get mathod name
		Method method = method_name.getMethod(); // get method
		LogAnnotation anno = method.getAnnotation(LogAnnotation.class); // get mathod annotation
		String op_type = anno.OperationType();
		String op_name = anno.OperationName();

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Employee user = (Employee) session.getAttribute("user"); // get user info from the session
		String ip = request.getRemoteAddr(); // get ip

		Log log = new Log();
		log.setOperateType(op_type);
		log.setDescription(op_name);
		log.setOperator(user.getEmployeeName());
		log.setOperateIP(ip);
		log.setMethodName((pjp.getTarget().getClass().getName() + "." + pjp.getSignature().getName() + "()")); // class_name.method_name
		log.setMethodParameters("");

		Object result = null;
		try
		{
			result = pjp.proceed(); // let the proxy method execute

			// 2 - equivalent to suf-notification (when the method is executed successfully, go over here)
			log.setOperateResult("successful");
		}
		catch (Exception e)
		{
			// 3 - equivalent to exception notification
			log.setOperateResult("failed");
			log.setExceptionCode(e.getClass().getName());
			log.setExceptionDetail(e.getMessage());
		}
		finally
		{
			// 4 - equivalent to final notification
			log.setOperateDate(new Date());
			service.addLog(log);
		}
		return result;
	}
}