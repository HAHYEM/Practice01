package com.javaex;

public class Problem04 {
	public static void main(String[] args) {
		System.out.println("숫자장난하기");

		int count = 10;
		for (int i = 1; i < count; i++) {
			for (int j = i; j < i + count; j++) {
				System.out.printf("%2d ", j);
			}
			System.out.println();
		}
	}
}
