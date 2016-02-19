package com.tt.cn.contract.privatepayment;

import com.tt.cn.contract.ServiceException;
import com.tt.cn.contract.payment.InstalmentData;

public class PrivateInstalmentData extends InstalmentData {

	@Override
	protected boolean shouldCheckTransactionReference() {
		return false;
	}

	@Override
	public void validate(String mainReference) throws ServiceException {
		super.validate(mainReference);
		checkTransactionRefefencesList(mainReference);
	}

	@Override
	public String toString() {
		return "PrivateInstalmentData [" + super.toString() + "]";
	}

}
