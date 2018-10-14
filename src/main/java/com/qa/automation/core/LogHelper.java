package com.qa.automation.core;

import org.apache.log4j.Logger;

public class LogHelper {
	public static Logger log = Logger.getLogger("autologger");
	public static int testCaseId;

	public static void setTestCaseId(int tcId) {
		testCaseId = tcId;
		logDbgMsg("Starting Test Case: " + tcId);
	}

	public static void logDbgMsg(String logmsg) {
		log.info("TC" + testCaseId + ": " + logmsg);
	}
}
