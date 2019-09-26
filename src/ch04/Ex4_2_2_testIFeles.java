package ch04;

import java.util.Scanner;

public class Ex4_2_2_testIFeles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      System.out.print("请输入成绩");
		int score = sc.nextInt();

		if (score >= 0 && score <= 100) {
			System.out.print("成绩" + score);
		}else {
			System.out.print("输入的成绩应该在0~99");
		}
      sc.close();
	}

}
