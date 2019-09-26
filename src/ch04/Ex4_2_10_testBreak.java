package ch04;

import java.util.Scanner;

public class Ex4_2_10_testBreak {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数");
        int n = sc.nextInt();
         Boolean flag = true;
         for(int i=2;i<n;i++) {
        	 if(n%i ==0) {
        		 flag = false;
        		 break;
        	 }
         }
         if(flag)
        	 System.out.print("是素数");
         else
        	 System.out.print("不是素数");;
        
       
       
       
	}

}
