package Java.lebin.Training.BasicDataTypes;/*
/*
此类用于演示浮点型的特点和使用

				意义				所占空间
	float		单精度浮点型		4个字节
	double		双精度浮点型		8个字节

特点：

	1、编译器默认的浮点型为double,可以标记为d或D
	2、float类型的常量值可以标记为f或F



*/


import java.math.BigDecimal;

class DoubleTypeDemo
{
	public static void main(String[] args)
	{
		System.out.println(1.5);

		double d = 1.5D;
		float f = 1.5F;
		float ff = 0.024162294f;
		double dd = ff;
//		System.out.println(dd);
//		输出结果是：127.0999984741211
		double test = (double)ff;
		System.out.println(test);

		BigDecimal b = new BigDecimal(String.valueOf(ff));
		double dd2 = b.doubleValue();
		System.out.println(dd2);

	}
}
