package com.customeexception;

public class SumOfAlternatePrimeNo {
	static int checkPrimeNo(int arr[]) {
		int count;
		int cnt=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=2;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}
			if(count==1) {
				cnt++;
				if(cnt%2!=0){
					sum=sum+arr[i];
				System.out.println("prime no are: "+arr[i]);
				}
			}
		}
		if(cnt<1)
			throw new NoPrimeNumberException("no any prime no found");
		System.out.println("sum is: "+sum);
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {3,6,5,10,11};
		checkPrimeNo(arr);
	}

}
