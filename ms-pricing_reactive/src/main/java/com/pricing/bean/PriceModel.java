package com.pricing.bean;

import lombok.Data;

import java.util.List;

@Data
public class PriceModel {

    private List<PriceItemRequest> items;
    private String transactionId;
    private OrderPriceResponse orderPriceInfo;
	/**
	 * @return the items
	 */
	public List<PriceItemRequest> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<PriceItemRequest> items) {
		this.items = items;
	}
	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the orderPriceInfo
	 */
	public OrderPriceResponse getOrderPriceInfo() {
		return orderPriceInfo;
	}
	/**
	 * @param orderPriceInfo the orderPriceInfo to set
	 */
	public void setOrderPriceInfo(OrderPriceResponse orderPriceInfo) {
		this.orderPriceInfo = orderPriceInfo;
	}
    
    
    
}
