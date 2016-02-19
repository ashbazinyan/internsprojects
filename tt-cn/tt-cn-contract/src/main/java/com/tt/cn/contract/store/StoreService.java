package com.tt.cn.contract.store;

import com.tt.cn.contract.payment.PaymentWebInitInput;
import com.tt.cn.contract.payment.PaymentWebInitOutput;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "urn:cn:contract:product")
public interface StoreService {

	@WebResult(name = "output", targetNamespace = "urn:cn:contract:product")
	ProductAddOutput
	addProduct(@WebParam(name = "input", targetNamespace = "urn:cn:contract:product") ProductAddInput input);

}
