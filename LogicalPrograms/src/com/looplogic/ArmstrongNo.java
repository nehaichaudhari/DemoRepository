package com.looplogic;

public class ArmstrongNo {
	static int countNo(int num) {
		int count = 0;
		while(num!=0) {
			count++;
			num /= 10;
		}
		return count;
	}	
		static void checkArmstrongNo(int no,int count) {
			int originalNo=no;
			double sum = 0;
			int rem=0;
			while(no!=0) {
				rem = no%10;//162
				int pow = 1;
				for(int i = 1;i<=count;i++) {
					pow= pow*rem;
				}
				sum = sum+pow;
				no = no/10;
			}
			if(originalNo == sum) {
				System.out.println("no is armstrong no");
			}else
				System.out.println("no is not armstrong no");
		}
		public static void main(String[] args) {
			int no = 153;
			//int no1 = no;
			//int rev = 0, rem = 0;
			int count = countNo(no);
			System.out.println("Count:"+countNo(no));
			checkArmstrongNo(no, count);
			/*System.out.println("Number is:" +no);
			while (no != 0) {
				rem = no % 10;//1623%10=3
				int pow =1;
				for (int i=1;i<=count;i++) {//4
					pow =pow *rem;
				}
				rev = rev + pow;
				no = no / 10;
			}
			if (no1 == rev) {
				System.out.println("no is armstrong");
			} else {
				System.out.println("no is not armstrong");
			}*/
			
		}

	}

