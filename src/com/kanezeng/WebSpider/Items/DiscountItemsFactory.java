/**
 *  Copyright 2012 Zhijian Zeng, All Rights Reserved.
 *  Email: me@kanezeng.com
 *	This file is created at 2012-1-31
 */
package com.kanezeng.WebSpider.Items;

/**
 * This is a Factory class to return all DiscountItems-like objects.
 */
public abstract class DiscountItemsFactory {
	public static final DiscountItems getDiscountItems(String siteDescription) {
		DiscountItems currectItem = null;

		if (siteDescription.equalsIgnoreCase("Gaopeng") == true) {
			currectItem = new GaoPengItems();
		} else if (siteDescription.equalsIgnoreCase("Lashou") == true) {
			currectItem = new LaShouItems();
		}

		return currectItem;
	}
}
