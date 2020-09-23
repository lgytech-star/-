package asd.one;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("请输入金额:");
        Scanner m=new Scanner(System.in);
        int money=m.nextInt();
         int a=money*100;
         int rest,count;
         int b[]= {10000,5000,2000,1000,500,100,50,20,10,5,1};
         for(int i=0;i<11;i++) 
         {
        	 if(a<b[i])
        	 {        		
        		 continue;
        	 }
        	 count=a/b[i];
        	 rest=a%b[i];
        	 a=rest;
        	 System.out.println(b[i]/100+"元  "+count+"个");
        	 if(rest==0)
        		 break;
         }
	}

}
