package Java.lebin.Training.FileSys.io2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 此类用于演示BufferedWriter的特点和使用
 * @author liyuting
 * 注意：多了newLine方法
 *
 */
public class TestBufferedWriter {

	
	public static void main(String[] args) {
		BufferedWriter writer=null;
		try {
			//1.创建BufferedWriter对象
			 writer = new BufferedWriter(new FileWriter("datas.txt"));
			
			
			//2.写入
			
			writer.write("xiaohua");
//			writer.write("\r\n");
			writer.newLine();//插入和平台相关的换行符
			writer.write("world");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(writer!=null)
					writer.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
