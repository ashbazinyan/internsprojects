package com.tt.cn.contract.payment;


import com.tt.cn.contract.ServiceException;

public class PaymentWebInitInput {
	private String merchantId;
	private Object customerEmail;
	private Contact customerContact;
	private Object context10;
	private Object transactionId;


	public String getMerchantId() {
		return merchantId;
	}

	public Contact getCustomerContact() {
		return customerContact;
	}

	public Object getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerContact(Contact customerContact) {
		this.customerContact = customerContact;
	}

	public Object getContext10() {
		return context10;
	}

	public Object getTransactionId() {
		return transactionId;
	}

	public void validate() throws ServiceException {

	}

}
