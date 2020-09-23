package asd.one;

import java.util.Scanner;

public class Mianji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入三角形的三边长:");
		Scanner m=new Scanner(System.in);
		int a=m.nextInt();
		int b=m.nextInt();
		int c=m.nextInt();
		int s=(a+b+c)/2;
		double d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("三角形的面积为"+d);		
	}

}
