package com.arrays.sixoct;

public class FindMaxFreq {
	static void findMaxFreq(int ar[]) {
		int count;
		int maxFreq = 0;
		int element=0;
		boolean flag;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			flag = false;
			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;
					}
				}
				System.out.println(ar[i] + " ----> " + count);
			}
			if (count > maxFreq) {
				maxFreq = count;
				element=ar[i];
			}
		}
		System.out.println("max freq is: "+element+"--->"+maxFreq);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4,2 };
		findMaxFreq(arr);
	}

}
