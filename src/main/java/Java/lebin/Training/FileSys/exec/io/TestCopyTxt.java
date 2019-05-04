package Java.lebin.Training.FileSys.exec.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 此类用于演示复制文本文件
 * @author liyuting
 *
 */
public class TestCopyTxt {
	
	public static void main(String[] args) {
		FileReader reader =null;
		FileWriter writer = null;
		try {
			//1.创建流对象
			 reader = new FileReader("C:\\Users\\liyuting\\Desktop\\0308\\day16\\测试题15.txt");
			
			 writer = new FileWriter("questions.txt");
			 
			//2.读写
				
				char[] buf = new char[1024];
				int len;
				while((len=reader.read(buf))!=-1){
					writer.write(buf,0,len);
				}
		}  catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(reader!=null)
					reader.close();
				if(writer!=null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
