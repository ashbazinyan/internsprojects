package com.tt.cn.contract.common.rest;

import com.tt.cn.contract.ServiceException;

public interface HasSeal {
	public String getSeal();

	public Long getKeyVersion();

	public String getMerchantId();

	/* Getter for sealAlgorithm */
	public String getSealAlgorithm();

	public void validateSealNeededFields() throws ServiceException;
}
