package asd.one;

public class Animal1 {
	public void bark() {
		System.out.println("...");
		}
	public static void main(String args[])
	{
		Cat cat =new Cat();
		cat.bark();
	}
}
class Cat extends Animal1
{
	public void bark()
	{
	super.bark();
}
}

