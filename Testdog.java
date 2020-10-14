package asd.one;
 class Animal
 {
	public void move()
	{
		System.out.println("动物会吃东西");
	}
	}
 class Dog extends Animal
 {
public void move() 
{
	System.out.println("狗会吃东西");
}
 }
public class Testdog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal a=new Animal();
    Dog b=new Dog();
    b.move();
    a.move();
	}
	}
