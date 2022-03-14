package com.lti.demos;

public class Customer {
	
	private int cusNo;
	private String custName;
	private double billAmount;
	public int getCusNo() {
		return cusNo;
	}
	public void setCusNo(int cusNo) {
		this.cusNo = cusNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [cusNo=" + cusNo + ", custName=" + custName + ", billAmount=" + billAmount + "]";
	}
	
	
	
	//

}
