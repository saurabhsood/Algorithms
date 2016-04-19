package com;

public class ResizeArrayStack {
	private int n;
	private Object[] items;
	public ResizeArrayStack(int capacity)
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
		Object value =items[--n];
		items[n] = null ;
		return value;
	}
	public static void main(String s[])
	{
		ResizeArrayStack fs = new ResizeArrayStack(3);
		fs.push(10);
		fs.push(5);
		fs.push(20);
		fs.push(30);
		System.out.println(fs.pop());
	}
}
