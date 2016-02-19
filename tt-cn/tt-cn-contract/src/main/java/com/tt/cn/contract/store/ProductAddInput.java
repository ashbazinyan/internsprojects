package com.tt.cn.contract.store;

import com.tt.cn.contract.ServiceException;
import com.tt.cn.contract.payment.Contact;

import java.util.List;

public class ProductAddInput {
	String productName;
    Float  productPrice;
    String priceUnit;
    Long   productCategoryId;
    String productDescription;
    String productImageUrl;
    Long sellerId;
    Long addedById;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getAddedById() {
        return addedById;
    }

    public void setAddedById(Long addedById) {
        this.addedById = addedById;
    }

    public void validate() throws ServiceException {

	}

    @Override
    public String toString() {
        return "ProductAddInput{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", priceUnit='" + priceUnit + '\'' +
                ", productCategoryId=" + productCategoryId +
                ", productDescription='" + productDescription + '\'' +
                ", productImageUrl='" + productImageUrl + '\'' +
                ", sellerId=" + sellerId +
                ", addedById=" + addedById +
                '}';
    }
}
