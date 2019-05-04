package Java.lebin.Training.Thread.safeSingleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * 此类用于演示单例设计模式
 * 保证系统中只有一个对象
 * @author liulebin
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
	A a = new A();
	A a2 = new A();
	a.start();
	a2.start();
		
	}

}

class A extends Thread{
	@Override
	public void run(){
		while(true){
			try{
				Thread.sleep(50);
				System.out.println(Single2.getInstance());
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}


//懒汉式 线程安全
class Single{
	
	//1、构造器私有化
	private Single(){}
	
	//2、本类内部创建对象
	private static Single single;
	
	//3、提供public static方法，暴露该对象
	public static Single getInstance(){
		if(single == null){//提高效率
			synchronized (Single.class){//当前类的字节码对象
				if(single == null){//线程安全
					try {
						Thread.sleep(500);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					single = new Single();
				}
			}
		}
		return single;
	}
}


//懒汉式 线程不安全
class Single2{

	//1、构造器私有化
	private Single2(){}

	//2、本类内部创建对象
	private static Single2 single;

	//3、提供public static方法，暴露该对象
	public static Single2 getInstance(){
		if(single == null){//提高效率
			try {
				Thread.sleep(50);
				}catch (InterruptedException e){
						e.printStackTrace();
				}
					single = new Single2();
		}
		return single;
	}
}

