package Java.lebin.Training.setSys.map;

import java.util.*;
import com.google.common.collect.Maps;

//Author:Hibiki last modified in 2018.10.04
public class HashMapTest {

	public static void main(String[] args) {

		Map userDataMap = new HashMap<String, String>();

		Map userDataMap1 = new HashMap<String, String>();
		Map userDataMap2 = new HashMap<String, String>();;

//		userDataMap1.put("Apple", "7299");

		userDataMap.putAll(userDataMap2);
		Map<String, String> userOfflineDataMap = Maps.newHashMap();

		Map<String, Map<String, String>> usermap = null;

		if(null != usermap){
			for (Map.Entry<String, Map<String, String>> entry : usermap.entrySet()) {
				userOfflineDataMap.putAll(entry.getValue());
			}
		}
		userDataMap.putAll(userOfflineDataMap);
		userDataMap.putAll(userDataMap1);


		System.out.println(">>>>>>>>>>>> "+userDataMap.toString());
	}
}