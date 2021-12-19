package lec22;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 5, 9, 11, 13 };
		int arr2[] = { 1, 2, 4, 6, 7 };

		int[] array = mergetwosortedarray(arr, arr2);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static int[] mergetwosortedarray(int[] arr, int arr2[]) {
		int[] ans = new int[arr.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr.length && j < arr2.length) {
			if (arr[i] <= arr2[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (j == arr2.length) {
			while (i < arr.length) {
				ans[k] = arr[i];
				i++;
				k++;
			}
		}
		if (i == arr.length) {
			while (j < arr2.length) {
				ans[k] = arr2[i];
				j++;
				k++;
			}
		}
		return ans;
	}
}
