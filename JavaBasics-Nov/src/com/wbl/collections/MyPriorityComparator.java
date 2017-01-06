package com.wbl.collections;

import java.util.Comparator;

public class MyPriorityComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int result = o2.compareTo(o1);
		/*if(result==-1){
			return 1;
		}else if(result==1){
			return -1;
		}*/
		return result;
	}

}
