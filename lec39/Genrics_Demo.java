package lec39;

import java.util.Arrays;
import java.util.Comparator;

public class Genrics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] arr = { 10, 20, 30, 40, 50 };
//		display(arr);
//		String[] arr1 = { "Ram", "Rahul", "Pooja", "Ravi" };
//		display(arr1);
		Cars[] car = new Cars[5];

		car[0] = new Cars(200, 10, "White");
		car[1] = new Cars(1000, 20, "Black");
		car[2] = new Cars(345, 3, "Yellow");
		car[3] = new Cars(34, 89, "Grey");
		car[4] = new Cars(8907, 6, "Red");
//		Sort(car,new CarPrince_Comparator());

		Arrays.sort(car, new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.color.compareTo(o2.color);
			}
		});
		display(car);

	}

	public static <T> void display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

//	public static <T extends Comparable<T>> void Sort(T[] arr) {
//
//		for (int pass = 1; pass < arr.length; pass++) {
//			for (int i = 0; i < arr.length - pass; i++) {
//				if (arr[i].compareTo(arr[i + 1])>0) {
//					T t = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = t;
//				}
//
//			}
//
//		}
//
//	}

	public static <T> void Sort(T[] arr, Comparator<T> camp) {

		for (int pass = 1; pass < arr.length; pass++) {
			for (int i = 0; i < arr.length - pass; i++) {
				if (camp.compare(arr[i], arr[i + 1]) > 0) {
					T t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

			}

		}

	}

}