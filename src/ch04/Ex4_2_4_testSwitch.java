package ch04;

public class Ex4_2_4_testSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = 1 + (int) (Math.random() * 4);

		switch (random) {
		case 1:
			System.out.print(" i fell fine");
			break;
		case 2:
			System.out.println("1've been better");
			break;
		case 3:
			System.out.println("i  feel horrible ");
			break;
		case 4:
			System.out.println("i feel terrible");
		}

	}

}
