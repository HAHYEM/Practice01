package com.javaex;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Problem08 {
	public static void main(String[] args) {
		int add = 0;
		int sub = 0;
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
		System.out.println("--------------------------------");
		System.out.println("     1.예금 2.출금 3.잔고 4.종료");
		System.out.println("--------------------------------");
		int a;
		int money = 0;
		System.out.print("선택 >> ");
		a = sc.nextInt();


			switch (a) {
			case 1:
				System.out.print("예금액 >> ");
				add = sc.nextInt();
				money += add;
				break;
			case 2:
				System.out.print("출금액 >> ");
				sub = sc.nextInt();
				if (money < sub) {
					System.out.println("못뺌");
				} else {
					money -= sub;
				}
				break;
			case 3:
				System.out.println("잔고액 >> " + money);

				break;
			case 4:
				System.out.print("프로그램 종료");
				b = false;
				break;
			default:
				System.out.println("다시 입력하셈");
			}
		}

	}
}
