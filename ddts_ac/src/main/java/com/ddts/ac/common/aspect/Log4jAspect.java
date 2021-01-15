package com.ddts.ac.common.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Log4jAspect
{

	Logger logger = Logger.getLogger(Log4jAspect.class);
	String str_log = null;

	/**
	 *  pre-notification
	 * @param jp : an action taken during the execution of a program, such as calling or exception throwing of  AServiceImpl.barA() 
	 */
	public void doBefore(JoinPoint jp)
	{
		str_log = "log Begining method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName();
		logger.info(str_log);
	}

	/**
	 * around-notification, like A doFilter method  in Servlet specification on the web
	 * @param pjp: the join point in current exceeding process
	 * @return
	 * @throws Throwable
	 */
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable
	{
		long time = System.currentTimeMillis();
		Object return_value = pjp.proceed();
		time = System.currentTimeMillis() - time;
		logger.info("process time: " + time + " ms");
		return return_value;
	}

	/**
	 * exception notification
	 * @param jp
	 */
	public void doAfter(JoinPoint jp)
	{
		str_log = "doAfter:log Ending method: " + jp.getTarget().getClass().getName() + "." + jp.getSignature().getName();
		logger.error(str_log);
	}
}