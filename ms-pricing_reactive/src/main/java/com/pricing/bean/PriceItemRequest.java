package com.pricing.bean;

import lombok.Data;

@Data
public class PriceItemRequest {

    private String skuId;
    private int qty;
    private String productId;
    private String id;
    private ItemPricingResponse itemPriceInfo;
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
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the itemPriceInfo
	 */
	public ItemPricingResponse getItemPriceInfo() {
		return itemPriceInfo;
	}
	/**
	 * @param itemPriceInfo the itemPriceInfo to set
	 */
	public void setItemPriceInfo(ItemPricingResponse itemPriceInfo) {
		this.itemPriceInfo = itemPriceInfo;
	}
    
    
}
