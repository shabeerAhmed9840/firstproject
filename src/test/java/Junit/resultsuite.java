package Junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class resultsuite {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(DemoJunit.class, SuiteA.class);
		int runCount = r.getRunCount();
		System.out.println(runCount);
		
		int ignoreCount = r.getIgnoreCount();
		System.out.println(ignoreCount);
		
		
		int failureCount = r.getFailureCount();
		System.out.println(failureCount);
		
		long runTime = r.getRunTime();
		System.out.println(runTime);
		
		List<Failure> failures = r.getFailures();
		for (Failure x : failures) {
			System.out.println(x);
			}
		boolean wasSuccessful = r.wasSuccessful();
		System.out.println(wasSuccessful);
		
		
		
		
		
		
		
		
	}

}
