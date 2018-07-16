package com.springboot.lin.test.stack;

public interface Stack {
	/**
	 * 返回堆栈的大小
	 *
	 * @return
	 */
	int getSize();

	/**
	 * 判断堆栈是否为空
	 *
	 * @return
	 */
	boolean isEmpty();

	/**
	 * 数据元素 e 入栈
	 *
	 * @param e
	 */
	void push(Object e);

	/**
	 * 栈顶元素出栈
	 *
	 * @return
	 * @throws StackEmptyException
	 */
	Object pop() throws StackEmptyException;

	/**
	 * 取栈顶元素
	 *
	 * @return
	 * @throws StackEmptyException
	 */
	Object peek() throws StackEmptyException;
}
