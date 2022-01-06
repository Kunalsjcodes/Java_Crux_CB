package lec25;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
//		int [] arr = new int [3];
//		System.out.println(arr[-1]);
		p.setAge(-10);
		p.setName("kaju");
		System.out.println(p.getAge()+" "+p.getName());
		

	}

}