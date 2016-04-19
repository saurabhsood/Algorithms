package com;

public class FixedStack {
private int n;
private Object[] items;
public FixedStack(int capacity)
{
	items = new Object[capacity];
}
public void push(int value){
	items[n++] = value;
}

public Object pop(){
	Object value =items[--n];
	items[n] = null ;
	return value;
}
public static void main(String s[])
{
	FixedStack fs = new FixedStack(3);
	fs.push(10);
	fs.push(5);
	System.out.println(fs.pop());
}
}
