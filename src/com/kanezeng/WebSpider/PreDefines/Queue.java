package com.kanezeng.WebSpider.PreDefines;


import java.util.LinkedList;
/**
 * A queue to store URLs
 */
public class Queue {
	// Use linked list
	private LinkedList queue = new LinkedList();
    // add a new object
	public void enQueue(Object t) {
		queue.addLast(t);
	}
    // Get the first element.
	public Object deQueue() {
		return queue.removeFirst();
	}
    // Check if it's empty
	public boolean isQueueEmpty() {
		return queue.isEmpty();
	}
    // Check if t is included in current queue
	public boolean contians(Object t) {
		return queue.contains(t);
	}

	public boolean empty() {
		return queue.isEmpty();
	}

}

