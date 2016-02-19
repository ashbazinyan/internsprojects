package com.tt.cn.contract.payment;

public class PaymentWebInitRestOutput extends PaymentWebInitOutput {
	
	private String seal;
	
	public String getSeal() {
		return seal;
	}

	public void setSeal(String seal) {
		this.seal = seal;
	}
	
	@Override
	public String toString() {
		return "PaymentWebInitRestOutput [seal=" + seal 
				+ ", " + super.toString() + "]";
	}
}
