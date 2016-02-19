package com.tt.cn.core.payment;

import com.tt.cn.contract.ServiceException;
import com.tt.cn.contract.payment.PaymentWebInitInput;
import com.tt.cn.contract.payment.PaymentWebInitOutput;
import com.tt.cn.core.CorePaymentWebInitInput;

import javax.servlet.http.HttpServletRequest;


public class PaymentOperation {
	public static PaymentWebInitOutput validateData(PaymentWebInitInput input, PaymentWebInitOutput pwiOut, HttpServletRequest httpRequest) {
		return null;
	}

	public static CorePaymentWebInitInput validatePE(PaymentWebInitInput input, CorePaymentWebInitInput corePaymentWebInitInput, boolean isPrivate) throws PaymentWebInitException, ServiceException {
		return null;
	}


	public static PaymentWebInitOutput payment(PaymentWebInitInput input, CorePaymentWebInitInput corePaymentWebInitInput, PaymentWebInitOutput pwiOut, boolean isPrivate) {
		return null;
	}
}
