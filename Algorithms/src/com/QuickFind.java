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
			 id[i] = i;
		 }
	 }
	 
	 void union(int p,int q)
	 {
		 id[q] = id[p];
	 }
	 
	 void count[]
	 boolean connected(int p, int q)
	 {
		 if(id[p] == id[q])
		 {
			 return true;
		 }
		 else 
		 {
			 return false;
		 }
	 }
	 
}
