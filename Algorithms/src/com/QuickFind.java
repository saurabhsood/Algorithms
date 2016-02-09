package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	 
	 
	 public static void main(String s[]) throws NumberFormatException, IOException
	 {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 QuickFind qf = new QuickFind(Integer.valueOf(br.readLine()));
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
				 System.out.println("Connected   " +qf.id[p]+"    "+qf.id[q]);
			 }
			 
			 read = br.readLine();
		 }
		br.close();
	 }
	 
}
