package Java.lebin.Training.OO面向对象.demo7;
/**
 * 此类用于演示初始化块的语法和好处
 * @author liyuting
 *
 */
public  class TestInit {
	
	
	public static void main(String[] args) {
		
		InitDemo id = new InitDemo();
		InitDemo id1 = new InitDemo("john");
	}

}


class InitDemo{
	
	String name;
	int age;
	double height;
	
	{
		System.out.println("初始化语句");
	}
	
	public InitDemo(){
		
		
	}

	
	public InitDemo(String name) {
		super();
		this.name = name;
	}


	public InitDemo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public InitDemo(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	
}