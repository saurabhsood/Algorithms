package pract;

public class MergeSort {
	
	public static void main(String s[])
	{
		mergeandSort(new int[]{1,3,5,0},0,4);
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
			mergeandSort(a,start,med);
			mergeandSort(a,start+med,end);
			sort(a,start,med,end);
		}
		else
		{
			med=1;
		}
		System.out.println("Finally Sort " +start +" "+end);
	}
	
	static int b[]= new int[6];
	public static void sort(int []a,int start,int med,int end)
	{
		int m1 =0;
		int m2 =0;


		for(int i =0; i <end-start;i++)
		{
			if(m1> med)b[start+i]=a[med+i];
			else if(m2 > (end-med)+i)b[start+i]=a[start+i];
			else if(a.length > ((end-med)+i) && a[m2+med] < a[start+m1])
			{
				b[start+i] = a[m2+start+med];
				m2++;
		}
			else
			{
				b[start+i] = a[m1+start];
				m1++;
			}
			
		}
	}

}
