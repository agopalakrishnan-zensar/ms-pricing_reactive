package com.pricing.data;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "price")
public class PriceItemDAO {

	@Id
    @NonNull
    private String skuid;
    @NonNull
    private String productId;
    @NonNull
    private double listPrice;
    @NonNull
    private double saleprice;
	/**
	 * @return the skuid
	 */
	public String getSkuid() {
		return skuid;
	}
	/**
	 * @param skuid the skuid to set
	 */
	public void setSkuid(String skuid) {
		this.skuid = skuid;
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
	 * @return the saleprice
	 */
	public double getSaleprice() {
		return saleprice;
	}
	/**
	 * @param saleprice the saleprice to set
	 */
	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}
    
    
}
