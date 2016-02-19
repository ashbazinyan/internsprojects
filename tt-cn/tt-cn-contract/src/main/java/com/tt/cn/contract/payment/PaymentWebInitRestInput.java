package com.tt.cn.contract.payment;



import com.tt.cn.contract.ServiceException;
import com.tt.cn.contract.common.rest.HasSeal;


public class PaymentWebInitRestInput extends PaymentWebInitInput implements HasSeal {
	@Override
	public String getSeal() {
		return null;
	}

	@Override
	public Long getKeyVersion() {
		return null;
	}

	@Override
	public String getMerchantId() {
		return null;
	}

	@Override
	public String getSealAlgorithm() {
		return null;
	}

	@Override
	public void validateSealNeededFields() throws ServiceException {

	}
}
