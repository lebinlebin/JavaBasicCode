package Java.lebin.Training.TEST;

import java.util.Arrays;
import java.util.List;

class arrayDouble
{
	public static void main(String[] args) 
	{
		Double[] PriceWeightRange;

		float[] resultProbDefault = new float[30];
		/**
		 * 不需要循环
		 * 直接打印数组信息
		 */
//		System.out.println(Arrays.toString(resultProbDefault));
		for(int i=0;i<1000;i++){
			System.out.println("ctr--->  "+randomRanker(0.001));
		}
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

}
