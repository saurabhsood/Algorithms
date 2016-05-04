package com;
public class MergeSort {
	
	public static void main(String s[])
	{
		int a[] =new int[]{0,3,-5,7,1,2,7,8,9,-4,-100,-12,12,14,17,77,-100000,99999999}; 
		b= new int[a.length];
		mergeandSort(a,0,a.length);
		
		for(int i=0; i <b.length;i++)
		{
			System.out.print(b[i]+",");	
		}
	}
	
	
	
	public static void mergeandSort(int a[],int start,int end)
	{
		int med =0;
		if(end-start >1)
		{			
			med = Math.round((end-start)/2);
			mergeandSort(a,start,start+med);
			mergeandSort(a,start+med,end);
			sort(a,start,med,end);
		}
		
	}
	
	static int b[];
	public static void sort(int []a,int start,int med,int end)
	{
		med = start+med;
		int m1 =start;
		int m2 = med;
		for(int i = start; i < end;i++)
		{
			b[i]=a[i];
		}
		

		for(int i =start; i <end;i++)
		{
			if(m1>= med)
				{
					b[i]=a[m2];
					m2++;
				}
			else if(m2 >= end)
				{
					b[i]=a[m1];
					m1++;
				}
			else if(b[m2] < a[m1])
			{
				b[i] = a[m2];
				m2++;
			}			
			else
			{
				b[i] = a[m1];
				m1++;
			}			
		}
		for(int i = start; i < end;i++)
		{
			a[i]=b[i];
		}
	}

}
