package com;

public class FixedQueue {
	private int n;
	private Object[] items;
	public FixedQueue(int capacity)
	{
		items = new Object[capacity];
	}
	public void push(int value){
		items[n++] = value;
	}

	public Object pop(){
		Object value =items[0];
		int i=1;
		for(; i < items.length;i++)
		{
			items[i-1]= items[i];
		}
		items[i-1] = null;
		return value;
	}
	public static void main(String s[])
	{
		FixedQueue fs = new FixedQueue(3);
		fs.push(10);
		fs.push(5);
		fs.push(50);
		System.out.println(fs.pop());
		System.out.println(fs.pop());
	}
}
