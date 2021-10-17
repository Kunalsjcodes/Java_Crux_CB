package lec09;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 8, 9, 11, 15, 18 };
		System.out.println(search(arr, 11));
	}

	public static int search(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
