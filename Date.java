package asd.one;

import java.util.Calendar;
import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	System.out.println("输入第一个年月日:");
	Scanner a=new Scanner(System.in);
	int year1=a.nextInt();
	int month1=a.nextInt();
	int day1=a.nextInt();
	Calendar m=Calendar.getInstance();
	m.set(Calendar.YEAR, year1);
	m.set(Calendar.MONTH, month1-1);
	m.set(Calendar.DAY_OF_MONTH, day1);
	int b=m.get(Calendar.DAY_OF_YEAR);
	System.out.println("输入第二个年月日");
	Scanner c=new Scanner(System.in);
	int year2=c.nextInt();
	int month2=c.nextInt();
	int day2=c.nextInt();
	Calendar n=Calendar.getInstance();
	n.set(Calendar.YEAR, year2);
	n.set(Calendar.MONTH, month2-1);
	n.set(Calendar.DAY_OF_MONTH,day2);
	int d=n.get(Calendar.DAY_OF_YEAR);
	int e=Math.abs(b-d);
	System.out.println("这两天之间相隔"+e+"天");
	}

}
