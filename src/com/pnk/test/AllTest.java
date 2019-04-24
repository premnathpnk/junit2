
package com.pnk.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.pnk.service.BankServiceImpl;

public class AllTest {
 private static BankServiceImpl service;
 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("AllTest.setUpBeforeClass()");
		service= new BankServiceImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AllTest.tearDownAfterClass()");
		service=null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("AllTest.setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("AllTest.tearDown()");
	}

	/*@Test
	public void testCalcIntrAmtwithIntegers() {
		int pAmt=1000;
		float rate=2;
		int time=20;
		int expectedIntrAmt=400;
		float actualIntrAmt=0.0f;
		// get Actual result
		  actualIntrAmt=service.CalcIntrAmt(pAmt,rate,time);
            
		assertEquals("Result",expectedIntrAmt,actualIntrAmt);
	}
	@Test
	public void testCalcIntrAmtwithFloat() {
		float pAmt=10000.0f;
		float rate=2.0f;
		float time=20.0f;
		float expectedIntrAmt=4000.0f;
		float actualIntrAmt=0.0f;
		// get Actual result
		actualIntrAmt=service.CalcIntrAmt(pAmt, rate, time);
		assertEquals("Result",expectedIntrAmt,actualIntrAmt,0.1f);
	}
	*/
	@Test(expected=IllegalArgumentException.class,timeout=10000)
	@Ignore
	public void testCalcIntrAmtwithZero() {
		float actualIntrAmt=0.0f;
		actualIntrAmt=service.CalcIntrAmt(0.0f,0.0f,0.0f);
		fail("Exception is Excepted but not raised");
	}
}
