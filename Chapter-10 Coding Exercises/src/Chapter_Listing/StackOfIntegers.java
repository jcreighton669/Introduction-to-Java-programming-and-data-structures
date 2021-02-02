/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_Listing;

/**
 *
 * @author Justin
 */
public class StackOfIntegers {

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	/**
	 * Construct a stack with the default capacity 16
	 */
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Construct a stack with the specified maximum capacity
	 *
	 * @param capacity
	 */
	public StackOfIntegers(int capacity) {
		this.elements = new int[capacity];
	}

	/**
	 * Push a new integer to the top of the stack
	 *
	 * @param value
	 */
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	/**
	 * Return and remove the top element from the stack
	 *
	 * @return
	 */
	public int pop() {
		return elements[--size];
	}

	/**
	 * Return the top element from the stack
	 *
	 * @return
	 */
	public int peek() {
		return elements[size - 1];
	}

	/**
	 * Test whether the stack is empty
	 *
	 * @return
	 */
	public boolean empty() {
		return size == 0;
	}

	/**
	 * Return the number of elements in the stack
	 *
	 * @return
	 */
	public int getSize() {
		return size;
	}
}
