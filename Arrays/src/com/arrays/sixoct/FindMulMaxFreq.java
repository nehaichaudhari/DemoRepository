package com.arrays.sixoct;

public class FindMulMaxFreq {
	static void findMaxFreq(int ar[]) {
		int count;
		int cnt[] = new int[ar.length];
		int maxFreq = 0;
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
				cnt[i] = count;
			}
			if (count > maxFreq) {
				maxFreq = count;
			}
		}
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == maxFreq) {
				System.out.println("max freq is: " + ar[i] + "--->" + cnt[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2, 2, 1, 1 };
		findMaxFreq(arr);
	}

}
