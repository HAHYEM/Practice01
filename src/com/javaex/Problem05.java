package com.javaex;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		System.out.println("숫자입력하여 최대값 구하기");
		System.out.println("숫자를 입력하세요");
		int[] in = new int[5];
		int max = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			in[i] = sc.nextInt();
			if (in[i] > max) {
				max = in[i];
			}
		}
		System.out.println("최대값은 " + max + "입니다.");
	}
}
