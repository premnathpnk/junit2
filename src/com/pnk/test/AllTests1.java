package com.pnk.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTest.class, AllTests.class })
public class AllTests1 {
	public static void main(String[] args) {
		
			Result result=JUnitCore.runClasses(AllTest.class);
			for(Failure failure:result.getFailures()) {
				System.out.println(failure.toString());
			}
		}

	

}
