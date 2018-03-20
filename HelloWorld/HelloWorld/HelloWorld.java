package HelloWorld;

public class HelloWorld {
	public static void main(String[] args) {
		Greeter greeter = new Greeter;
		System.out.println(greeter.sayHello());
		Animal animal1, animal2;
		animal1 = new Human();
		animal2 = new Dog();
		System.out.println(animal1.sayHello());
		System.out.println(animal2.sayHello());
	}
}