package com;


public class LinkedListQueue {
	private Node first;
	private Node last;
	private class Node
	{
		Object value;
		Node prev;
	}
	
	public boolean isEmpty()
	{
		return first ==null;
	}
	
	public Object pop()
	{
		Object value = last.value;
		last = last.prev;
		return value;
	}
	
	public void push(Object o)
	{		
		Node old = first;
		Node n = new Node();
		n.value= o;		
	
		first=n;
		if(last== null)
			last =first;
		else
			old.prev = n;
	}
	
	public static void main(String s[])
	{
		LinkedListQueue lls = new LinkedListQueue();
		lls.push(1);
		lls.push(2);
		lls.push(3);
		System.out.println(lls.pop());
		System.out.println(lls.pop());
		System.out.println(lls.pop());
	}
}
