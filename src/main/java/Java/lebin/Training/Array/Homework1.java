package Java.lebin.Training.Array;

//1. 输出100以内的所有素数(质数)，每行显示5个；并求和。
/*
素数：只能被1和本身整除的数
比如：3 5 7 11 13 17 19 23


9 ：
2 3 4 5 6

*/
import java.util.Scanner;
class Homework1
{
	public static void main(String[] args)
	{
		int count = 0;//统计个数
		int sum = 0;//求和

		for(int i=2;i<=100;i++){//i:待判断的元素
			boolean flag = false;
			for(int j=2;j<=Math.sqrt(i);j++){//j:除数
				if(i%j==0){
					//不是素数
					flag = true;//更新标记
					break;
				}

			}

			if(!flag){
				//是素数
				System.out.print(i+"\t");
				count++;
				if(count%5==0){
					System.out.println();
				}
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
//【普通循环】
//【选作】5. 中国有句俗语叫“三天打鱼两天晒网”。
//如果从1990年1月1日起开始执行“三天打鱼两天晒网”。如何判断在以后的某一天中是“打鱼”还是“晒网”？


/*
1998-3-4

1998-3-4————————1990-1-1 的总天数  185


1.1998-1-1——————1990—1-1 的天数

2.1998-1-1——————1998-3-14 的天数



185%5
	1
	2
	3
	4
	0

*/

class Homework2
{
	public static void main(String[] args)
	{

		Scanner input  = new Scanner(System.in);
		System.out.print("请输入年：");
		int year = input.nextInt();
		System.out.print("请输入月：");
		int month = input.nextInt();
		System.out.print("请输入日：");
		int day = input.nextInt();


		//1.求整年的天数差： year-1-1——————————1990-1-1
		int sumOfYears = 0;


		for(int i=1990;i<year;i++){//i代表每一年
			if(i%4==0&&i%100!=0||i%400==0)
				sumOfYears+=366;
			else
				sumOfYears+=365;
		}

		//2.输入的这一年的日期到本年的1月1日的天数差
		int sumOfMonths = 0;
		for(int i=1;i<month;i++){
			switch(i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:sumOfMonths+=31;break;
				case 2:
					if(year%4==0&&year%100!=0||year%400==0)
						sumOfMonths+=29;
					else
						sumOfMonths+=28;
					break;
				default:
					sumOfMonths+=30;
					break;


			}

		}

		int totalDays = sumOfMonths+sumOfYears+day;

		switch(totalDays%5){
			case 1:
			case 2:
			case 3:
				System.out.println("打鱼");break;
			default:
				System.out.println("筛网");break;


		}

	}

}