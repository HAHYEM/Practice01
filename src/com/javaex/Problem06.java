package com.javaex;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");

		int a = sc.nextInt();

		int b = 0;

		if (a % 2 == 0) {
			for (int i = 2; i < a; i += 2) {
				b += i;
			}

		} else {
			for (int i = 1; i <= a; i += 2) {
				b += i;
			}
		}
		System.out.println(b);
	}
}
