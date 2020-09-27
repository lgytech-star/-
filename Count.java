package asd.one;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[1000];
		int count=0;
		for(int i=0;i<1000;i++)
		{
			a[i]=(int)(Math.random()*100);
		}
		for(int i=0;i<100;i++)
			{
			for(int j=0;j<1000;j++)
			{
				if(i==a[j])
					count++;
			}			
			System.out.println(i+"出现了"+count+"次");
			count=0;
			}
	}

}
