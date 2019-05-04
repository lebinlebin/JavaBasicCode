package Java.lebin.Training.setSys.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

import Java.lebin.Training.setSys.test.Employee;

/**
 * 使用Map添加几个员工对象，要求键：员工
值：员工工资

员工类：姓名、工资、编号

要求：先对员工的编号排序，然后再按工资排序

 * @author liyuting
 *
 */
public class TestTreeMap {
	@Test
	public void test1(){
		
		//1.创建TreeMap对象
		TreeMap map = new TreeMap();
		
		//2.添加元素
		map.put(new Employee("任我行",1000,1), 1000);
		map.put(new Employee("岳不群",3000,2), 3000);

		map.put(new Employee("岳灵珊",300,3), 300);
		map.put(new Employee("林平之",8,4), 8);
		map.put(new Employee("依琳",900,3), 300);
		
		//3.遍历元素
		Set entrys = map.entrySet();
		
		for (Object object : entrys) {
			Entry entry = (Entry) object;
			
			System.out.println(entry.getKey());
		}
	}

}
