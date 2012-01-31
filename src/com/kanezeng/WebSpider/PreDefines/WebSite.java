/**
 *  Copyright 2012 Zhijian Zeng, All Rights Reserved.
 *  Email: me@kanezeng.com
 *	This file is created at 2012-1-31
 */
package com.kanezeng.WebSpider.PreDefines;

/**
 * This class define all information for the specific web site.
 */
public class WebSite {
	public String ID = "";
	public String name = "";
	public String homeURL = "";
	public String filter = ""; // A filter to figure URL links for the items
	public String siteDescription = ""; // A string mostly used by the Factory class to create correct item class.
	
	public WebSite() {
		
	}
	
	public WebSite(String ID, String name, String homeURL, String filter, String siteDescription) {
		this.ID = ID;
		this.name = name;
		this.homeURL = homeURL;
		this.filter = filter;
		this.siteDescription = siteDescription;
	}
}
