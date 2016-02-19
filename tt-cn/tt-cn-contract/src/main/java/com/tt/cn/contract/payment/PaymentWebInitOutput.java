package com.tt.cn.contract.payment;

import org.apache.activemq.broker.region.cursors.PendingList;

public class PaymentWebInitOutput {
	private String redirectionVersion;
	private PendingList redirectionStatusCode;
	private String redirectionData;
	private String redirectionStatusMessage;
	private String redirectionUrl;

	public void setRedirectionVersion(String redirectionVersion) {
		this.redirectionVersion = redirectionVersion;
	}

	public PendingList getRedirectionStatusCode() {
		return redirectionStatusCode;
	}

	public String getRedirectionData() {
		return redirectionData;
	}

	public String getRedirectionStatusMessage() {
		return redirectionStatusMessage;
	}

	public String getRedirectionUrl() {
		return redirectionUrl;
	}

	public String getRedirectionVersion() {
		return redirectionVersion;
	}

	public void setRedirectionStatusCode(PendingList redirectionStatusCode) {
		this.redirectionStatusCode = redirectionStatusCode;
	}

	public void setRedirectionStatusMessage(String redirectionStatusMessage) {
		this.redirectionStatusMessage = redirectionStatusMessage;
	}


}
