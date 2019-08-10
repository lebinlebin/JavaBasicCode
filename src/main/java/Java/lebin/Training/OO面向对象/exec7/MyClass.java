package Java.lebin.Training.OO面向对象.exec7;


public class MyClass {
	static int x,y;
	static{
		int x=5;
		x--;
	}
	static{
		x--;
	}

	public static void main(String[] args) {
		x--;
		myMethod() ;
		System.out.println(x+y + ++x);
	}
	
	public static void myMethod() {
		y=x++ + ++x;	
	}
}
