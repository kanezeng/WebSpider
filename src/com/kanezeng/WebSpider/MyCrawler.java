package com.kanezeng.WebSpider;

import java.util.ArrayList;
import java.util.Set;

import com.kanezeng.WebSpider.PreDefines.LinkFilter;
import com.kanezeng.WebSpider.PreDefines.LinkQueue;
import com.kanezeng.WebSpider.PreDefines.WebSite;

public class MyCrawler {
	/**
	 * Initial link queue with given seeds.
	 * 
	 * @return
	 * @param seeds
	 *            Seeds URL
	 */
	private void initCrawlerWithSeeds(String seed) {
		LinkQueue.clear();
		LinkQueue.addUnvisitedUrl(seed);
	}

	/**
	 * Crawling method.
	 * 
	 * @return
	 * @param seeds
	 */
	public void crawling(WebSite currentSite) { // Define a filter to get
												// specific
		// URLs we need
		LinkFilter filter = new LinkFilter() {
			public boolean accept(String url, String filter) {
				if (url.startsWith(filter))
					return true;
				else
					return false;
			}
		};
		// Initiate URL queue
		initCrawlerWithSeeds(currentSite.homeURL);
		String siteFilter = currentSite.filter ;
		// Work until all URLs are visited or reach 1000 pages
		while (!LinkQueue.unVisitedUrlsEmpty()
				&& LinkQueue.getVisitedUrlNum() <= 1000) {
			// Get the first unvisited URL
			String visitUrl = (String) LinkQueue.unVisitedUrlDeQueue();
			if (visitUrl == null)
				continue;
			DownLoadFile downLoader = new DownLoadFile();
			// Download the page
			downLoader.downloadFile(visitUrl);
			// Move the URL to visited list
			LinkQueue.addVisitedUrl(visitUrl);
			// Extract specific links from the downloaded page
			Set<String> links = HtmlParserTool.extracLinks(visitUrl, siteFilter, filter);
			// Put the new URLs into URL queue
			for (String link : links) {
				LinkQueue.addUnvisitedUrl(link);
			}
		}
	}

	// main method
	public static void main(String[] args) {
		MyCrawler crawler = new MyCrawler();
		ArrayList<WebSite> allSites = InitWebSites.getWebSites();

		for (WebSite currentSite : allSites) {
			crawler.crawling(currentSite);
		}
//		crawler.crawling(new String[] { "http://www.baidu.com" });
		// com.kanezeng.utils.ConvertEncodings test = new
		// com.kanezeng.utils.ConvertEncodings();
		// String myresult = test.un2ex("abc‘¯÷æº·");
		// System.out.println(myresult);
		// test.printPossibleString();
	}

}
