package com;

public class ReSizeArrayQueue {
	private int n;
	private Object[] items;
	public ReSizeArrayQueue(int capacity)
	{
		items = new Object[capacity];
	}
	public void push(int value){
		if(items.length == n)
		{System.out.println("increasing size");;
			Object[] items1 = new Object[items.length*2];
			for(int i =0; i <items.length;i++)
			{
				items1[i] = items[i]; 
			}
			items = items1;
		}
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
		ReSizeArrayQueue fs = new ReSizeArrayQueue(3);
		fs.push(10);
		fs.push(5);
		fs.push(20);
		fs.push(30);
		System.out.println(fs.pop());
	}
}
