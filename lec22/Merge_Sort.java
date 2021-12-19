package lec22;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 7, 5, 4, 2 };
		arr = Mergesort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] Mergesort(int arr[], int si, int ei) { // si = start index , ei = end index
		if (si == ei) {
			int[] basecase = new int[1];
			basecase[0] = arr[si];
			return basecase;
		}

		int mid = (si + ei) / 2;
		int[] firstarr = Mergesort(arr, si, mid);
		int[] secondarr = Mergesort(arr, mid + 1, ei);

		return mergetwosortedarray(firstarr, secondarr);

	}

	public static int[] mergetwosortedarray(int[] arr1, int arr2[]) {
		int[] ans = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		if (j == arr2.length) {
			while (i < arr1.length) {
				ans[k] = arr1[i];
				i++;
				k++;
			}
		}
		if (i == arr1.length) {
			while (j < arr2.length) {
				ans[k] = arr2[i];
				j++;
				k++;
			}
		}
		return ans;
	}
}
