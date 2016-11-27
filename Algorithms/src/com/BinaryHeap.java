package com;

public class BinaryHeap {
	
	private static final int a[]={8,5,4,2,9,10,50,11};
	private static final int b[]= new int[a.length+1];	
	private static int counter=1;
	
	public static void main(String s[])
	{
			for(int i=0 ; i <a.length;i++)
			{
				add(a[i]);
			}
			
			System.out.println(delMax());
			add(6);			
			delMax();
			add(3);
			delMax();
			for(int i=1 ; i <b.length;i++)
			{
				System.out.print(b[i]+" ");
			}				
	}
	
	public static void add(int value)
	{	
		if(counter==1)
		{
			b[counter++]=value;
			return;
		}		
		b[counter]=value;
		swim(value);
		counter++;
	}
	
	public static void swim(int value)
	{
		int k=counter /2;
		int oldp=counter;
		while(k >= 1 && value > b[k])
		{			
			b[oldp]=b[k];
			b[k]=value;
			oldp=k;
			k = k /2;
		}
	}
	
	public static void sink()
	{
		int value =b[1];
		int k =0;
		k=2;
		int qp=0;
		int pc=1;
		while(k < counter && value < b[k] ){
			if( b[k] > value && b[k] > b[k+1])
			{
				qp= b[k];
				b[k]= value;
				b[pc]= qp;
				pc=k;
				k=2*k;
			}
			else if(b[(k+1)] > value)
			{
				qp= b[k+1];
				b[pc]= qp;
				b[k+1]= value;
				pc=k+1;
				k=2*(k+1);
			}
			
		}
	}
	
	
	public static int  delMax()
	{
		int value = b[1];
		b[1]=b[counter-1];
		b[counter-1]=0;
		sink();
		counter--;
		return value;
		
	}
	
	
	
	
	
}