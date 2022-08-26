package com.pricing.bean;

import lombok.Data;

@Data
public class ItemPricingResponse {
	
	
	public ItemPricingResponse() {
		super();
	}
	public ItemPricingResponse(String skuId, String productId, double salePrice, double listPrice, double finalPrice,
			String currencyCode, boolean discounted, double discount) {
		super();
		this.skuId = skuId;
		this.productId = productId;
		this.salePrice = salePrice;
		this.listPrice = listPrice;
		this.finalPrice = finalPrice;
		this.currencyCode = currencyCode;
		this.discounted = discounted;
		this.discount = discount;
	}
	
	String skuId;
	String productId;
    double salePrice;
    double listPrice;
    double finalPrice;
    String currencyCode;
    boolean discounted;
    double discount;
	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}
	/**
	 * @param skuId the skuId to set
	 */
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the salePrice
	 */
	public double getSalePrice() {
		return salePrice;
	}
	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	/**
	 * @return the listPrice
	 */
	public double getListPrice() {
		return listPrice;
	}
	/**
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	/**
	 * @return the finalPrice
	 */
	public double getFinalPrice() {
		return finalPrice;
	}
	/**
	 * @param finalPrice the finalPrice to set
	 */
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}
	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	/**
	 * @return the discounted
	 */
	public boolean isDiscounted() {
		return discounted;
	}
	/**
	 * @param discounted the discounted to set
	 */
	public void setDiscounted(boolean discounted) {
		this.discounted = discounted;
	}
	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	/*
	 * public record ItemPricingResponse(String skuId, String productId, double
	 * salePrice,double listPrice, double finalPrice,String currencyCode, boolean
	 * discounted,double discount) { }
	 */

}