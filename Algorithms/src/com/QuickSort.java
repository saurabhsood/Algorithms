package com;

public class QuickSort {

	public static void main(String s[]) {
		int[] a = { 200, 5, 10, 8, 7,1,100};
		sortOnDivNumber(a, 0, a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void sortOnDivNumber(int[] a, int start, int end) {
		if(end-start <=1)
		{
			return;
		}
		int b = a[end - 1];
		int counter = start;

		for (int i = start; i < end; i++) {
			if (a[i] <= b) {
				if (i != counter) {
					int hold = a[counter];
					a[counter] = a[i];
					a[i] = hold;
				}
				counter++;
			}
		}
		sortOnDivNumber(a,start,counter-1);
		sortOnDivNumber(a,start+counter-1,end);
		
	}

}
