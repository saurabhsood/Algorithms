package com;

import java.util.Arrays;

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
			for(int k=0; k <element.length;k++)
			{
				System.out.print(element[k]+",");	
			}
			System.out.println();;
		}
		
	}
	public static void main(String s[])
	{
		SelectionSort ss= new SelectionSort(5);
		ss.element = new int[]{30,43,66,28,24,56,31,52,94,73};
		ss.sort();
		
		for(int i=0; i <ss.element.length;i++)
		{
			System.out.print(ss.element[i]+",");	
		}
	}
	
}
