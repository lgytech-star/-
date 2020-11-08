package asd.one;

import java.io.*;

public class Book {
	
	public static void main(String[] args) throws Exception {
		T book11=new T();
		book11.code="book11";
		book11.name="name11";
		T book12=new T();
		book12.code="book12";
		book12.name="name12";
		FileOutputStream m=new FileOutputStream("D:\\booklist.txt");
		ObjectOutputStream c=new ObjectOutputStream(m);
		c.writeObject(book11);
		c.writeObject(book12);
		c.flush();
		c.close();
	}

}
class T implements Serializable
{
	String code;
	String name;
}