package com.tt.cn.contract.payment;

import javax.annotation.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

@WebService(targetNamespace = "urn:cn:contract:payment")
public interface PaymentService {

	@Generated(value = "XA", comments = "-636259708")
	@WebMethod
	@WebResult(name = "output", targetNamespace = "urn:cn:contract:payment")
	PaymentWebInitOutput paymentWebInit(
			@WebParam(name = "input", targetNamespace = "urn:cn:contract:payment") PaymentWebInitInput input);

	String test();
}
