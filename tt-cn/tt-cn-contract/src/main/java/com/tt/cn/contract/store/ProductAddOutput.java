package com.tt.cn.contract.store;

import org.apache.activemq.broker.region.cursors.PendingList;

public class ProductAddOutput {
	private String redirectionVersion;
	private PendingList redirectionStatusCode;
	private String redirectionData;
	private String redirectionStatusMessage;
	private String redirectionUrl;

	public String getRedirectionVersion() {
		return redirectionVersion;
	}

	public void setRedirectionVersion(String redirectionVersion) {
		this.redirectionVersion = redirectionVersion;
	}

	public PendingList getRedirectionStatusCode() {
		return redirectionStatusCode;
	}

	public void setRedirectionStatusCode(PendingList redirectionStatusCode) {
		this.redirectionStatusCode = redirectionStatusCode;
	}

	public String getRedirectionData() {
		return redirectionData;
	}

	public void setRedirectionData(String redirectionData) {
		this.redirectionData = redirectionData;
	}

	public String getRedirectionStatusMessage() {
		return redirectionStatusMessage;
	}

	public void setRedirectionStatusMessage(String redirectionStatusMessage) {
		this.redirectionStatusMessage = redirectionStatusMessage;
	}

	public String getRedirectionUrl() {
		return redirectionUrl;
	}

	public void setRedirectionUrl(String redirectionUrl) {
		this.redirectionUrl = redirectionUrl;
	}

	@Override
	public String toString() {
		return "ProductAddOutput{" +
				"redirectionVersion='" + redirectionVersion + '\'' +
				", redirectionStatusCode=" + redirectionStatusCode +
				", redirectionData='" + redirectionData + '\'' +
				", redirectionStatusMessage='" + redirectionStatusMessage + '\'' +
				", redirectionUrl='" + redirectionUrl + '\'' +
				'}';
	}
}
