package com;

public class LinkedListStack {

	private Node first;
	private class Node
	{
		Object value;
		Node next;
	}
	
	public boolean isEmpty()
	{
		return first ==null;
	}
	
	public Object pop()
	{
		Object value = first.value;
		first = first.next;
		return value;
	}
	
	public void push(Object o)
	{
		Node old = first;
		Node n = new Node();
		n.value= o;		
		n.next =old;
		first=n;
	}
	
	public static void main(String s[])
	{
		LinkedListStack lls = new LinkedListStack();
		lls.push(1);
		lls.push(2);
		lls.push(3);
		System.out.println(lls.pop());;
		System.out.println(lls.pop());;
		
	}
}
