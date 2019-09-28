package Java.lebin.Training.FileSys.io3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;

/**
 * 此类用于演示序列化和反序列化流
 * @author liulebin
 * 
 * 序列化：将二进制文件持久化到本地或网络
 * 
 * 反序列化：将存到本地或网络的数据还原到程序中
 *
 * 效果：读写的对象必须是同一个
 * 要求：序列化和反序列化的对象必须具备序列化的特点，也就是实现Serializable接口
 *
 * 分类：
 * 
 * ObjectOutputStream:序列化
 * 
 * ObjectInputStream:反序列化
 */

public class TestObjectIO {
	//测试序列化
	@Test
	public void test1() throws IOException {
		//1.创建对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\object.dat"));
		//2.写入
		oos.writeInt(100);//写入四个字节
		oos.writeChar('n');//写入2个字节
		oos.writeBoolean(true);
		oos.writeUTF("张三丰");
		oos.writeObject(new Person("john"));
		//3.关闭
		oos.close();
	}
	//测试反序列化
	@Test
	public void test2() throws  IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\object.dat"));
		
		System.out.println(ois.readInt());
		System.out.println(ois.readChar());
		System.out.println(ois.readBoolean());
		System.out.println(ois.readUTF());
		System.out.println(ois.readObject());
		ois.close();
	}

}

class Person implements Serializable{
	String name;
	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
