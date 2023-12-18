package com.arrays.fouroct;

public class FindFreqSecApp {
	static void findFreq(int ar[]) {
		int count;
		boolean visited;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			visited = false;
			// check if the element is already compared - not a new element
			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;
					}
				}
				System.out.println(ar[i]+" ----> "+count);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 3, 1, 5, 2, 3, 4 };
		findFreq(arr);
	}

}
