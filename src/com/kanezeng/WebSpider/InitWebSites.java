/**
 *  Copyright 2012 Zhijian Zeng, All Rights Reserved.
 *  Email: me@kanezeng.com
 *	This file is created at 2012-1-31
 */
package com.kanezeng.WebSpider;

import java.util.ArrayList;

import com.kanezeng.WebSpider.PreDefines.WebSite;
/**
 * This Class will get all web sites we would like to control.
 */
public class InitWebSites {
	public static ArrayList<WebSite> getWebSites() {
		ArrayList<WebSite> allWebSites = new ArrayList<WebSite>();
		
		allWebSites.add(new WebSite("1","GaoPeng.com","http://www.gaopeng.com","http://www.gaopeng.com/deals/quanguo","Gaopeng"));
		
		return allWebSites;
	}
}
