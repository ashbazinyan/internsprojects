package com.tt.cn.contract.payment;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface PaymentServiceRest {

	@POST
	@Path("/paymentInit")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	com.tt.cn.contract.payment.PaymentWebInitRestOutput paymentWebInit(
			com.tt.cn.contract.payment.PaymentWebInitRestInput input);

	@GET
	@Path("/test")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	String test();

}
