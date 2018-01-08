package com.javaex;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("          [숫자맞추기게임] ");
		System.out.println("=================================");
		
		int i = 108;
		while(true) {
			System.out.print(" >> ");
			int num = sc.nextInt();
			if(i > num) {
				System.out.println("더 높게");

			}else if(i < num) {
				System.out.println("더 낮게");
				System.out.print(" >> ");
				num = sc.nextInt();
			}else {
				System.out.print("맞았습니다.\n게임을 종료하시겠습니까?(Y/N) >> ");
				String ac = sc.nextLine();
				if(ac.equals("Y")) {
					System.exit(0);
				}else {
					continue;
				}
			}
		break;
		}
	}
}
