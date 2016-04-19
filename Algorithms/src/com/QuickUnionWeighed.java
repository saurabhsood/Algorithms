package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickUnionWeighed {

	private int id[];
	
	QuickUnionWeighed(int size)
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
	 

	 void union(int p,int q)
	 {
		 int r = find(p);
		 int s = find(q);
		 if(r==s)
		 {
			 return;
		 }else
		 {
			 id[p] = id[q];
		 }
		
	 }
	 
	 int root(int p)
	 {
		 int q = id[p];
		while(id[q]!=q)
		{
			q=id[q];
		}
		return q;
	 }
	 
	 int find(int q)
	 {
		 return root(q);
	 }
	 
	 int count()
	 {
		 return id.length;
	 }
	 
	 //2 Array Acess
	 boolean connected(int p, int q)
	 {
		 return root(p) == root(q);		 
	 }
	 
	 public static void main(String s[]) throws NumberFormatException, IOException
	 {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 QuickUnionWeighed qf = new QuickUnionWeighed(Integer.valueOf(br.readLine()));
		 System.out.println("Size" + qf.count());
		 String read = br.readLine();
		 String a[];
		 while(!read.equals(""))
		 {
			 a = read.split(" ");
			 int p=Integer.valueOf(a[0]);
			 int q=Integer.valueOf(a[1]);
			 if(!qf.connected(p, q))
			 {
				 qf.union(p, q);
				 System.out.println("Union   " +qf.id[p]+"    "+qf.id[q]);
			 }
			 else
			 {
				 System.out.println("Connected   " +qf.root(p)+"    "+qf.root(q));
			 }
			 
			 read = br.readLine();
		 }
		br.close();
	 }
	 
}
