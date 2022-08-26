package com.pricing.bean;

import lombok.Data;

@Data
public class OrderPriceResponse {
	
	public OrderPriceResponse() {
		super();
	}
	public OrderPriceResponse(String currencyCode, int itemCount, double subtotal, double discount, double total) {
		super();
		this.currencyCode = currencyCode;
		this.itemCount = itemCount;
		this.subtotal = subtotal;
		this.discount = discount;
		this.total = total;
	}
	String currencyCode;
	int itemCount;
	double subtotal;
	double discount;
	double total;
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
	 * @return the itemCount
	 */
	public int getItemCount() {
		return itemCount;
	}
	/**
	 * @param itemCount the itemCount to set
	 */
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}
	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
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
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	
	 
	 
	/*
	 * public record OrderPriceResponse(String currencyCode, int itemCount, double
	 * subtotal, double discount, double total) { }
	 */
}

