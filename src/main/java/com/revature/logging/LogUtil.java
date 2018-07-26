package com.revature.logging;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class LogUtil {

	private static Logger log = Logger.getRootLogger();
	
	public static void logDebug(String s) {
//		general debugging logs, keeping track of loops and breaks
		log.debug(s);
	}
	
	public static void logWarn(String s) {
//		caught an exception in the program	
		log.warn(s);
	}
	
	public static void logInfo(String s) {
//		a major step that you want to track of in your program
		log.info(s);
	}
	
	public static void logError(String message) {
//		for errors and unhandled exceptions
		log.error(message);
	}
	
	public static void logFatal(String message) {
//		program fails, crashes, etc. last thing you want to happen
		log.fatal(message);
	}
	
	public static void logTrace(String message) {
//		everything else
		log.trace(message);
	}
}
