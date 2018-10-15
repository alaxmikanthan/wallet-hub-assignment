package com.qa.automation.core;

import org.apache.log4j.Logger;

public class LogHelper {
	public static Logger log = Logger.getLogger("autologger");
	public static int testCaseId;
	public static int StepID = 0;

	public static void setTestCaseId(int tcId) {
		testCaseId = tcId;
		log.info("Starting Test Case: " + tcId);
	}

	public static void logDbgMsg(String logmsg) {
		StepID = StepID + 1;
		log.info("TC" + testCaseId + "-" + "Step" + StepID + ": " + logmsg);
	}
}
