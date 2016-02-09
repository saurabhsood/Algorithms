package com;

public class QuickFind {

	private int id[];
	
	QuickFind(int size)
	{
		intialize(size);		
	}
	
	 void intialize(int size)
	 {
		 id = new int[size];
		 for(int i = 0 ; i < size; i++)
		 {
			 id[i] = i; // N Operations
		 }
	 }
	 
	 //2N+2 Array Acess
	 void union(int p,int q)
	 {
		p = id[p];
		q = id[q];
		for(int i =0 ; i < id.length; i++)
		{
			if(id[i] == p)
			{
				id[i] = q;
			}
		}
	 }
	 
	 int find(int q)
	 {
		 return id[q];
	 }
	 
	 int count()
	 {
		 return id.length;
	 }
	 
	 //2 Array Acess
	 boolean connected(int p, int q)
	 {
		 return id[p] == id[q];		 
	 }
	 
}
