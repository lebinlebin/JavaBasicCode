package Java.lebin.Training.JavaCoreApi.day15.encap;

public class TestInteger {
	
	
	public static void main(String[] args) {
		Integer m = 1;//自动装箱，实则调用Integer类的valueOf
		Integer n = 1;
		System.out.println(m == n);

		Integer x = 128;//new Integer(128);
		Integer y = 128;//new Integer(128)
		System.out.println(x == y);

		
	}

}
