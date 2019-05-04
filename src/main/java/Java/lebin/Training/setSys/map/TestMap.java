package Java.lebin.Training.setSys.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 此类用于演示Map接口的特点和常见方法
 * @author liyuting
 *【面试题】通过size方法和isEmpty方法判断元素个数是否为0，谁的效率高？
 *
 *  答：一样
 */
public class TestMap {
	
	public static void main(String[] args) {
		//1.创建Map接口对象
		Map map = new HashMap();
		
		
		//2.调用方法
		//方法1：put
		map.put("邓超","孙俪");
		map.put("张继科","景甜");
		map.put("李晨","范冰冰");
		map.put("贾乃亮","李小璐");
		map.put("邓超","江一燕");
		map.put("Pgone","李小璐");
		map.put("王宝强", null);
		map.put(null, "马蓉");
		
		
		//方法2：remove
		
		map.remove("贾乃亮");
		
		//方法3：get
		System.out.println(map.get("王宝强"));
		
		//方法4:containsKey|containsValue
		System.out.println(map.containsKey("邓超"));
		System.out.println(map.containsValue("马蓉"));
		
		
		//方法5：clear
		map.clear();
		
		
		//方法6：size
		System.out.println(map.size());
		//方法7：isEmpty
		System.out.println(map.isEmpty());
		if(map.size()==0){}
		if(map.isEmpty()){}
		//3.遍历
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
	}

}
