package com.tt.cn.contract.privatepayment;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Context10 {

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String certificateKey;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String caddie;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String cancelReturnUrl;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String data;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String merchantCountry;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String receiptComplement;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String transmissionDate;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String proxyName;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String proxyPort;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String apiVersion;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String statementReference;

	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	private String paymentCertificate;

	/**
	 * @return the certificateKey
	 */
	public String getCertificateKey() {
		return certificateKey;
	}

	/**
	 * @param certificateKey the certificateKey to set
	 */
	public void setCertificateKey(String certificateKey) {
		this.certificateKey = certificateKey;
	}

	/**
	 * @return the caddie
	 */
	public String getCaddie() {
		return caddie;
	}

	/**
	 * @param caddie the caddie to set
	 */
	public void setCaddie(String caddie) {
		this.caddie = caddie;
	}

	/**
	 * @return the cancelReturnUrl
	 */
	public String getCancelReturnUrl() {
		return cancelReturnUrl;
	}

	/**
	 * @param cancelReturnUrl the cancelReturnUrl to set
	 */
	public void setCancelReturnUrl(String cancelReturnUrl) {
		this.cancelReturnUrl = cancelReturnUrl;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return the merchantCountry
	 */
	public String getMerchantCountry() {
		return merchantCountry;
	}

	/**
	 * @param merchantCountry the merchantCountry to set
	 */
	public void setMerchantCountry(String merchantCountry) {
		this.merchantCountry = merchantCountry;
	}

	/**
	 * @return the receiptComplement
	 */
	public String getReceiptComplement() {
		return receiptComplement;
	}

	/**
	 * @param receiptComplement the receiptComplement to set
	 */
	public void setReceiptComplement(String receiptComplement) {
		this.receiptComplement = receiptComplement;
	}

	/**
	 * @return the transmissionDate
	 */
	public String getTransmissionDate() {
		return transmissionDate;
	}

	/**
	 * @param transmissionDate the transmissionDate to set
	 */
	public void setTransmissionDate(String transmissionDate) {
		this.transmissionDate = transmissionDate;
	}

	/**
	 * @return the proxyName
	 */
	public String getProxyName() {
		return proxyName;
	}

	/**
	 * @param proxyName the proxyName to set
	 */
	public void setProxyName(String proxyName) {
		this.proxyName = proxyName;
	}

	/**
	 * @return the proxyPort
	 */
	public String getProxyPort() {
		return proxyPort;
	}

	/**
	 * @param proxyPort the proxyPort to set
	 */
	public void setProxyPort(String proxyPort) {
		this.proxyPort = proxyPort;
	}

	/**
	 * @return the apiVersion
	 */
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * @param apiVersion the apiVersion to set
	 */
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	/**
	 * @return the statementReference
	 */
	public String getStatementReference() {
		return statementReference;
	}

	/**
	 * @param statementReference the statementReference to set
	 */
	public void setStatementReference(String statementReference) {
		this.statementReference = statementReference;
	}

	/**
	 * @return the paymentCertificate
	 */
	public String getPaymentCertificate() {
		return paymentCertificate;
	}

	/**
	 * @param paymentCertificate the paymentCertificate to set
	 */
	public void setPaymentCertificate(String paymentCertificate) {
		this.paymentCertificate = paymentCertificate;
	}

	@Override
	public String toString() {
		return "Context10 [certificateKey=" + certificateKey + ", caddie=" + caddie + ", cancelReturnUrl=" + cancelReturnUrl + ", data=" + data
				+ ", merchantCountry=" + merchantCountry + ", receiptComplement=" + receiptComplement + ", transmissionDate=" + transmissionDate
				+ ", proxyName=" + proxyName + ", proxyPort=" + proxyPort + ", apiVersion=" + apiVersion + ", statementReference="
				+ statementReference + ", paymentCertificate=" + paymentCertificate + "]";
	}

}
