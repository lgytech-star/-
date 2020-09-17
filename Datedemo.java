package asd.one;

import java.util.Calendar;
import java.util.Scanner;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入年月日");
		Scanner sc=new Scanner (System.in);
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);
		c.set(Calendar.DAY_OF_MONTH, day);
		int week=c.get(Calendar.DAY_OF_WEEK);
		switch(week) 
		{
		case 1:
			System.out.println("这一天是星期日");		
			break;
		case 2:
			System.out.println("这一天是星期一");
			break;
		case 3:
			System.out.println("这一天是星期二");
			break;
		case 4:
			System.out.println("这一天是星期三");
			break;
		case 5:
			System.out.println("这一天是星期四");
			break;
		case 6:
			System.out.println("这一天是星期五");
			break;
	    case 7:
	    	System.out.println("这一天是星期六");
	    	break;
						
		}
			}

}
