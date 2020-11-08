package asd.one;

import java.util.Random;

public class Fanxingjiekou implements Generator<String> {

	public String[] fruit= {"Apple","Peach","Banana"};
	public String next(){
		Random a=new Random();
		return fruit[a.nextInt(fruit.length)];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fanxingjiekou fg=new Fanxingjiekou();
		for(int i=0;i<5;i++)
		System.out.println(fg.next());
	}

}
