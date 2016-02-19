package com.tt.cn.contract.payment;

import java.util.List;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.tt.cn.contract.ServiceException;
import com.tt.cn.contract.annotations.Since;

public class InstalmentData {

	private Short number;

	@XmlElementWrapper(name = "datesList")
	@XmlElement(name = "date")
	private List<String> datesList;

	@XmlElementWrapper(name = "transactionReferencesList")
	@XmlElement(name = "transactionReference")
	private List<String> transactionReferencesList;

	@XmlElementWrapper(name = "amountsList")
	@XmlElement(name = "amount")
	private List<Long> amountsList;

	@Since(2.7)
	@XmlElementWrapper(name = "s10TransactionIdsList")
	@XmlElement(name = "s10TransactionId")
	private List<String> s10TransactionIdsList;

	/**
	 * @return the number
	 */
	public Short getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Short number) {
		this.number = number;
	}

	/**
	 * @return the datesList
	 */
	public List<String> getDatesList() {
		return datesList;
	}

	/**
	 * @param datesList the datesList to set
	 */
	public void setDatesList(List<String> datesList) {
		this.datesList = datesList;
	}

	/**
	 * @return the transactionReferencesList
	 */
	public List<String> getTransactionReferencesList() {
		return transactionReferencesList;
	}

	/**
	 * @param transactionReferencesList the transactionReferencesList to set
	 */
	public void setTransactionReferencesList(List<String> transactionReferencesList) {
		this.transactionReferencesList = transactionReferencesList;
	}

	/**
	 * @return the amountsList
	 */
	public List<Long> getAmountsList() {
		return amountsList;
	}

	/**
	 * @param amountsList the amountsList to set
	 */
	public void setAmountsList(List<Long> amountsList) {
		this.amountsList = amountsList;
	}

	/**
	 * @return the s10TransactionIdsList
	 */
	public List<String> getS10TransactionIdsList() {
		return s10TransactionIdsList;
	}

	/**
	 * @param s10TransactionIdsList the s10TransactionIdsList to set
	 */
	public void setS10TransactionIdsList(List<String> s10TransactionIdsList) {
		this.s10TransactionIdsList = s10TransactionIdsList;
	}

	public void validate(String mainReference) throws ServiceException {

	}

	protected void checkTransactionRefefencesList(String mainReference) throws ServiceException {
	}

	protected void checkS10TransactionIdsList() throws ServiceException {
	}

	protected boolean shouldCheckTransactionReference() {
		return true;
	}

	@Override
	public String toString() {
		return "InstalmentData [number=" + number + ", transactionReferencesList=" + transactionReferencesList + ", s10TransactionIdsList="
				+ s10TransactionIdsList + ", amountsList=" + amountsList + ", datesList=" + datesList + "]";
	}

}
