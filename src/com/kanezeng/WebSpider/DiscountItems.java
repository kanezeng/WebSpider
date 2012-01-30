/**
 * 
 */
package com.kanezeng.WebSpider;


/**
 * @author zengkane
 *
 */
public class DiscountItems {
	public String name = "";
	public String fromURL = "";
	public String targetLink = "";
	public String currentPrice = "";
	public String originalPrice = "";
	public String discountRate = "";
	public String updatedDate = "";
	
	public DiscountItems(String name,String fromURL, String targetLink, String currentPrice, String originalPrice, String discountRate) {
		this.name = name;
		this.currentPrice = currentPrice;
		this.fromURL = fromURL;
		this.targetLink = targetLink;
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
		this.updateDate();
	}
	
	private void updateDate() {
		
	}
}
