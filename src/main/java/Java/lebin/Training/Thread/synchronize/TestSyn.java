package Java.lebin.Training.Thread.synchronize;
/**
 * 有2个账户分别向同一个卡上取钱（10000），每次都取1000

 * @author liyuting
 *
 */
public class TestSyn {
	
	public static void main(String[] args) {
		
		WithDraw w1 = new WithDraw();
		
		Thread t1 = new Thread(w1);
		t1.setName("周芷若");
		t1.start();
		
		
		Thread t2 = new Thread(w1);
		t2.setName("赵敏");
		t2.start();
	}

}


class WithDraw implements Runnable{
	int money = 10000;
	
	@Override
	public void run() {
		
		while(true){
			
			synchronized (this) {
				if (money <= 0) {
					System.out.println("钱已经取完");
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "取了1000，还剩余：" + (money -= 1000));
			}
			
			
		}
		
	}
	
}