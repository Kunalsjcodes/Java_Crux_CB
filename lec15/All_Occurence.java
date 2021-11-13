package lec15;

public class All_Occurence {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 2, 7, 3, 2, 7, 2, 3 };
//		All(arr, 0, 7);
		int[] ans = AllOcc(arr, 0, 7, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	//if we just want to return index
//	public static void All(int[] arr, int i, int item) {
//		if (i == arr.length) {
//			return;
//		}
//		if (arr[i] == item) {
//			System.out.print(i + " ");
//		}
//		All(arr, i + 1, item);
//	}

	//if we want to store the index in an array
	public static int[] AllOcc(int[] arr, int i, int item, int count) {
		if (i == arr.length) {
			int[] bs = new int[count];
			return bs;
		}

		if (arr[i] == item) {
			int[] ans = AllOcc(arr, i + 1, item, count + 1);
			ans[count] = i;
			return ans;
		}

		else {
			return AllOcc(arr, i + 1, item, count);
		}
	}

}
