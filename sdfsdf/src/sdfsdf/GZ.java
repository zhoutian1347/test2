package sdfsdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GZ {
	public static void main(String[] args) {
		ArrayList<Integer> dataList = new ArrayList<Integer>(Arrays.asList(10,20,30,null));
//		resetList(dataList);
		System.out.println("resetList"+dataList);
//		setOne(dataList);
		int sum = 0;
		for(Integer v:dataList) {
//			sum += v;
		}
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		a(a1);
		System.out.println("a1 =" + a1);
		
		System.out.println(sum);
		
	}
	
	public static void a(List<Integer> a) {
		a = new ArrayList<Integer>(a);
		a.set(2, 33);
		a.add(123);
//		a.remove(3);
		System.out.println(a);
	}
	
	
	
	
	public static void resetList(List<Integer>dataList) {
		dataList.subList(2,4).set(0, 40);
		dataList = new ArrayList<Integer>(dataList);
		dataList.add(50);
	}
	public static void setOne(List<Integer>dataList) {
		dataList.set(3, 100);
	}

}
