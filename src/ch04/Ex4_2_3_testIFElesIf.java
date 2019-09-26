package ch04;

import java.util.Scanner;

public class Ex4_2_3_testIFElesIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("请输入成绩");
		int score = sc.nextInt();

		char gread;

		if (score >= 90)
			gread = 'A';
		else if (score >= 80)
			gread = 'B';
		else if (score >= 70)
			gread = 'C';
		else if (score >= 60)
			gread = 'D';
		else
			gread = 'F';

		System.out.print("成绩的等级是" + gread);
		sc.close();

	}

}
