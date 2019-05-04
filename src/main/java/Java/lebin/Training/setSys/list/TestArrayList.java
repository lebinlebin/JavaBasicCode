package Java.lebin.Training.setSys.list;

import java.util.ArrayList;

/**
 * 此类用于演示ArrayList的底层结构和源码分析
 * @author liyuting
 *
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class TestArrayList {
	
	public static void main(String[] args) {
		ArrayList list  = new ArrayList();
		
		for(int i=1;i<=10;i++){
			list.add("john"+i);
		
		}
		
		for(int i=11;i<=20;i++){
			list.add("john"+i);
		
		}
		
		
	}

}
