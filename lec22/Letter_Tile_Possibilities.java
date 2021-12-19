package lec22;

public class Letter_Tile_Possibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAB";
		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch - 'A']++;
		}
		Letter_Tile(freq, "");
		System.out.println(Letter_Tiles_Count(freq, ""));
	}

	public static void Letter_Tile(int[] freq, String ans) {
		System.out.println(ans);
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				char ch = (char) (i + 'A');
				freq[i]--;
				Letter_Tile(freq, ans + ch);
				freq[i]++;
			}
		}
	}

	public static int Letter_Tiles_Count(int[] freq, String ans) {
		int count = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				char ch = (char) (i + 'A');
				freq[i]--;
				count = count + Letter_Tiles_Count(freq, ans + ch) + 1;
				freq[i]++;
			}
		}
		return count;
	}
}
