package Java.lebin.Training.FileSys.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 此类用于演示BufferedInputStream和BufferedOutputStream的特点和使用
 * @author liyuting
 *
 */
public class TestBuffered1 {
	
	public static void main(String[] args) throws IOException {
		
		//1.创建流对象
		BufferedInputStream bis =
				new BufferedInputStream(new FileInputStream("E:\\beauty\\2.jpg"));
		BufferedOutputStream bos =
				new BufferedOutputStream(new FileOutputStream("copy.jpg"));
		
		
		//2.读写
		
		int len;
		byte[] b=new byte[1024];
		while((len=bis.read(b))!=-1){
			bos.write(b, 0, len);
		}
		
		//3.关闭
		bos.close();
		bis.close();
		
		
		
	}

}
