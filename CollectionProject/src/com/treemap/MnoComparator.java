package com.treemap;

import java.util.Comparator;

public class MnoComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return Long.valueOf(o1.getPhoneNo()).compareTo(Long.valueOf(o2.getPhoneNo()));
//		if (o1.getPhoneNo()>o2.getPhoneNo()) {
//			return 1;
//		}
//		else if (o1.getPhoneNo()<o2.getPhoneNo()) {
//			return -1;
//		}
//		else return 0;
	}

}
