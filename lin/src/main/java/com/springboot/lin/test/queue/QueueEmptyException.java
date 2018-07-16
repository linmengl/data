package com.springboot.lin.test.queue;

class QueueEmptyException extends RuntimeException {
	public QueueEmptyException(String err) {
		super(err);
	}
}
