package lec39;

import java.util.Comparator;

public class CarPrince_Comparator implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o2.price - o1.price;
	}

}
