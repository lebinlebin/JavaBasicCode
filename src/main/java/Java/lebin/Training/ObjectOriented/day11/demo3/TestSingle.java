package Java.lebin.Training.ObjectOriented.day11.demo3;
/**
 * 此类用于演示单例设计模式
 * @author liyuting
 * 步骤：
 * 1、构造器私有化
 * 2、本类内部创建对象
 * 3、提供public static方法，暴露该对象
 *
 * 饿汉式和懒汉式的差异：
 * 
 * 1、创建对象的时机不同！
 * 2、应用场合不同
 * 如果仅仅考虑效率问题，可以使用懒汉式
 * 如果考虑线程安全问题，可以使用饿汉式
 * 
 * 
 * 经典案例：Runtime类就使用了饿汉式单例设计模式
 * 
 * 【面试题】自己编写懒汉式代码！
 * 
 * 
 */
public class TestSingle {
	
	public static void main(String[] args) {
//		Single1 s = new Single1();
		
//		Single1 s1 = Single1.getInstance();
//		Single1 s2 = Single1.getInstance();
//		
//		System.out.println(s1==s2);//true
//		
//		Single2.rate=1000;
		Single2 s1 =Single2.getInstance();
		
		Single2 s2 = Single2.getInstance();
		
		System.out.println(s1==s2);
		
	}

}

//方式二：懒汉式


class Single2{
	
	public static int rate;
	//1、构造器私有化
	private Single2(){}
		
	//2、本类内部创建对象 ★
		
	private static Single2 s ;
		
	//3、提供public static方法，暴露该对象
	
	public static Single2 getInstance(){
		if(s==null)
			s=new Single2();
		return s;
	}
	
	
}
//方式一：饿汉式

class Single1{
	
	public static int rate=100;
	//1、构造器私有化
	private Single1(){}
	
	//2、本类内部创建对象
	
	private static Single1 s = new Single1();
	
	//3、提供public static方法，暴露该对象
	public static Single1 getInstance(){
		return s;
	}
}
