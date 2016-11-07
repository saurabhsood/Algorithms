package com;

public class QuickSort {
	
	public static void main(String s[])
	{
		int [] a={2,5,10,1,7,8,3,4,9,6};
		quick(a);
	}
	
	
	
	protected static void quick(int [] a)
	{
		
		int pivot = a[a.length-1];
		int j =0;
		for(int i =0 ; i < a.length ; i++)
		{
			if(a[i] <= pivot)
			{
				if(i==j)
					j++;
				else
				{
					int ab = a[j];
					a[j] = a[i];
					a[i]=ab;
					j++;
				}
			}
			
		}
		System.out.println("sss"+a[j-1]);
		for(int i =0; i < a.length;i++){
			System.out.println(a[i]);
		}
		
	}
	
	protected void divide( int [] a)
	{
		
	}
	
}
