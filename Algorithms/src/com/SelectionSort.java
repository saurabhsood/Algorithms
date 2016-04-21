package com;

public class SelectionSort {

	private int[] element;
	SelectionSort(int size)
	{
		element = new int[size];
	}
	
	public void sort()
	{
		int length = element.length;
		int min;
		int index;
		for(int i =0 ; i <length;i++)
		{
			min = element[i];
			index = i;
			for(int j =i;j <length;j++)
			{
				if(min > element[j])
				{
					min = element[j];
					index =j;
				}									
			}
			element[index] = element[i];
			element[i]=min;
		}
		
	}
	public static void main(String s[])
	{
		SelectionSort ss= new SelectionSort(5);
		ss.element = new int[]{8,7,1,2,9,90,50,10,2,3,7};
		ss.sort();
		
		for(int i=0; i <ss.element.length;i++)
		{
			System.out.print(ss.element[i]+",");	
		}
	}
	
}
