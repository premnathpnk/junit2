package com.pnk.service;

public class BankServiceImpl implements BankService {

	@Override
	public float CalcIntrAmt(float pAmt, float rate, float time) throws IllegalArgumentException {
		float intrAmt=0.0f;
		intrAmt=pAmt*rate*time/100.0f;
		try {
			Thread.sleep(11000);
		}
		catch(Exception e) {}
		if(pAmt<=0||rate<=0||time<=0)
			throw new IllegalArgumentException("Invalid input");
		return intrAmt ;
	}

}
