package asd.one;

public class Testfanxing {
	public static <T> void displayArray(T[] anArray)
	{
		for(T t:anArray)
		{
			System.out.println(t);
			System.out.println("...");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer []a= {1,2,3,4,5};
      displayArray(a);
      String []b= {"RNG","EDG","WE"};
      displayArray(b);
      Car[] m=new Car[2];
      m[0]=new Car("A",2,4);
      m[1]=new Car("B",2,4);
      displayArray(m);
	}
}

