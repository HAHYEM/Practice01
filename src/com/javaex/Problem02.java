package com.javaex;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요");
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}