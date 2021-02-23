package Java.lebin.Training.TEST;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class arrayDouble
{
	public static void main(String[] args) 
	{
//		Double[] PriceWeightRange;
//
//		float[] resultProbDefault = new float[30];
//		/**
//		 * 不需要循环
//		 * 直接打印数组信息
//		 */
////		System.out.println(Arrays.toString(resultProbDefault));
//		for(int i=0;i<1000;i++){
//			System.out.println("ctr--->  "+randomRanker(0.001));
//		}

		String abc = "11";//,22,33,44,55
		String[] ABC = abc.split(",");
		System.out.println(ABC[0]);
		String[]  advaluearr = "12,14".split(",");
		String[] virtualCategoryProfileList = "5,4,13,14,0".split(",");
		double virtualCategoryMatchScore = 0.0;

		/**
		 * 虚拟类目加权
		 */
		if (null != virtualCategoryProfileList) {
			double virtualCategoryPWeight = 2.0;
				for (String virtualCategory : virtualCategoryProfileList) {
					if (null != virtualCategory  && match(advaluearr,virtualCategory)) {
						virtualCategoryMatchScore += virtualCategoryPWeight * 2;
					}
					virtualCategoryPWeight = virtualCategoryPWeight - 0.2;
				}

		}



		System.out.println(virtualCategoryMatchScore);




	}
	private static double  randomRanker(double low) {
			String bid = "1.0";
			double R = Math.random()*low;
			double ctr = R;
			return ctr;
			//为保证预估值的6位有效数字*1000
//			double ctr = MathUtils.sigmoidFunction(1000 * R / Double.parseDouble(bid), 0.5);   //二手车 实验  对比纯按ctr排序实验，去掉bid因素。 后期切为ecpm排序记得改回来。
//			//double ctr = R;
//			featureContext.getPredictResult().setCtr(ctr);
//			featureContext.getPredictResult().setQvalue(ctr);
		}


	public static boolean match(String[] arr, String targetValue) {
		return Arrays.asList(arr).contains(targetValue);
	}


}
