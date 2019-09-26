package ch05;

public class Ex5_5__this1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cat garfield = new Cat("黄",12);
		//garfield.grow();
		//garfield.grow();
	}
  
	class Cat{
		String furColor;
		int height;
		public Cat(String color) {
			this.furColor= color;
			this.cry();
		}
		public Cat(String color, int height) {
			this(color);
			this.height=height;
		}
		public void cry() {
			System.out.println("我是一只"+ this.furColor+ "颜色的猫");
		}
		public void grow() {
			this.height++;
			System.out.println("我长高了，身高是" + this.height);
		}
	}
	
}
