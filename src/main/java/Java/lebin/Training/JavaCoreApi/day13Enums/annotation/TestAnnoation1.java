package Java.lebin.Training.JavaCoreApi.day13Enums.annotation;

public class TestAnnoation1 {
	
	public static void main(String[] args) {
		Father f = new Sub();
		f.ol();
	}

}
class Sub extends Father{
	
//	@Override
	public void o1(){
		System.out.println("Sub 方法");
	}
	
}

class Father{
	public void ol(){
		System.out.println("Father 方法");
	}
}