package lec27;

import lec20.Normal_Maze;

public class Static_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hey");
		System.out.println(Normal_Maze.noofways(new boolean[4][4], 0, 0));
	}

	static {
		System.out.println("hello");
	}

}