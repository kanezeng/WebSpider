package com.kanezeng.WebSpider.PreDefines;


public interface LinkFilter {
	public boolean accept(String url, String filter);
}

