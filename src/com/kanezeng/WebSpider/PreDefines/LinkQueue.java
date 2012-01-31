package com.kanezeng.WebSpider.PreDefines;


import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Queue;
/**
 * @author Zhijian Zeng
 * Email: me@kanezeng.com
 *
 */
public class LinkQueue {
	// All visited URLs
	private static Set visitedUrl = new HashSet();
	// All unvisited URLs
	private static Queue unVisitedUrl = new PriorityQueue();

	// Get Unvisited URLs list
	public static Queue getUnVisitedUrl() {
		return unVisitedUrl;
	}
    // Add an URL to visited list
	public static void addVisitedUrl(String url) {
		visitedUrl.add(url);
	}
    // Remove visited URL
	public static void removeVisitedUrl(String url) {
		visitedUrl.remove(url);
	}
    // Get an unvisited URL.
	public static Object unVisitedUrlDeQueue() {
		return unVisitedUrl.poll();
	}

	// Check and make sure all URLs are visted only once.
	public static void addUnvisitedUrl(String url) {
		if (url != null && !url.trim().equals("")
 && !visitedUrl.contains(url)
				&& !unVisitedUrl.contains(url))
			unVisitedUrl.add(url);
	}
    // Get the number of visited URLs
	public static int getVisitedUrlNum() {
		return visitedUrl.size();
	}
    // Check if there is no URLs left unvisited.
	public static boolean unVisitedUrlsEmpty() {
		return unVisitedUrl.isEmpty();
	}
	
	// Clear the queue
	public static void clear() {
		visitedUrl = new HashSet();
		unVisitedUrl = new PriorityQueue();
	}

}
