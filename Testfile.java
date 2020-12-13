package asd.one;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Testfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="D:\\test.txt";
		FileOutputStream fos=new FileOutputStream(path);
		byte []a= {65,66,67};
		fos.write(a);
		if(fos!=null)
		{
			fos.close();
		}

	}

}
