package Java.lebin.Training.Thread.TreadCall;
/**
 * 此类用于演示线程创建并启动方式的区别
 * @author liulebin
 *案例：三个售票窗口卖票
 */
public class TestThreadStartDiff {
	
	public static void main(String[] args) {
		
		//创建并启动 方式一
//		SellTicket s1 = new SellTicket();
//		s1.start();
//		
//		SellTicket s2 = new SellTicket();
//		s2.start();
//		
//		SellTicket s3 = new SellTicket();
//		s3.start();
		
		//创建并启动 方式二
		
		SellTicket2 st = new SellTicket2();
		
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		
		
		
	}

}

//方式二：

class SellTicket2 implements Runnable{
	 int tickets = 100;//总票数
//	static int tickets2 = 100;
		@Override
		public void run() {
			while(true){
				if(tickets<=0){
					System.out.println("票已经售完！");
					break;
				}
				System.out.println(Thread.currentThread().getName()+"卖了一张票，票数余额："+(--tickets));
			}
			
		}
}



//方式一：
class SellTicket extends Thread{
	
   int tickets = 100;//总票数
	@Override
	public void run() {
		while(true){
			if(tickets<=0){
				System.out.println("票已经售完！");
				break;
			}
			System.out.println(Thread.currentThread().getName()+"卖了一张票，票数余额："+(--tickets));
		}
		
	}
	
	
}