package com.arrays.fiveoct;

public class SecHighWithoutSorting {
	static void secHigh(int ar[]) {
		int highest = Integer.MIN_VALUE;
		int sechigh=Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>highest) {
				sechigh=highest;
				highest=ar[i];
			}
			else if(ar[i]>sechigh) {
				sechigh=ar[i];
			}
		}
		System.out.println("second highest no: "+sechigh);
	}
	public static void main(String[] args) {
		int arr[]= {6,7,10,2,4,9,5};
		secHigh(arr);
	}
}
