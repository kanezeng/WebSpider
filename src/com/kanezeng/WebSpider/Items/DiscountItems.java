package com.kanezeng.WebSpider.Items;

import com.kanezeng.utils.DateTime;


/**
 * @author Zhijian Zeng
 * Email: me@kanezeng.com
 * This is a parent object for all items.
 */
public class DiscountItems {
	public String name = "";
	public String fromURL = "";
	public String targetLink = "";
	public String currentPrice = "";
	public String originalPrice = "";
	public String discountRate = "";
	public String updatedDate = "";
	
	public DiscountItems() {
		this.updateDate();
	}
	
	public DiscountItems(String name,String fromURL, String targetLink, String currentPrice, String originalPrice, String discountRate) {
		this.name = name;
		this.currentPrice = currentPrice;
		this.fromURL = fromURL;
		this.targetLink = targetLink;
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
		this.updateDate();
	}
	
	/**
	 * This method will update the date & time for current object.
	 */
	private void updateDate() {
		this.updatedDate = DateTime.getSystemTime();
	}
	
	/**
	 * This method will extract all possible information from the input file.
	 * @param inputFile The file you would like to extract information from.
	 */
	public void extractInfoFromFile(String inputFile) {
		this.updateDate();
	}
}
