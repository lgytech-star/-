package asd.one;

public class paixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [100];
		int t;
		for(int i=0;i<100;i++)
		{
			a[i]=(int)((Math.random())*1000);
		}
		for(int i=0;i<99;i++)
		{
			for(int j=0;j<99-i;j++)
				if(a[j]>a[j+1])
					{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					}
		}
		for(int i=0;i<100;i++)
			System.out.print(a[i]+" ");
	}

}
