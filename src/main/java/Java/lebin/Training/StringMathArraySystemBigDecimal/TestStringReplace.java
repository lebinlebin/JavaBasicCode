package Java.lebin.Training.StringMathArraySystemBigDecimal;
/**
 * 此类用于演示StringBuffer类和String类之间的转换
 * @author liulebin
 *
 */
public class TestStringReplace {
	
	public static void main(String[] args) {
		
	String AA = "2539:1|2|6|7|11,112831:3";
		String BB = AA.replaceAll("2539:1\\|2\\|6\\|7\\|11","").replaceAll("112831:\\d{1}","");
		System.out.println(BB);
	}

}
