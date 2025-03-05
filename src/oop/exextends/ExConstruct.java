package oop.exextends;

public class ExConstruct {
	public static void main(String[] args) {
		Whale2 whale2 = new Whale2();
		whale2.print();
	}
}

class Animal {
	public Animal() {
		System.out.println("Animal");
	}
}

class Mammal2 extends Animal {
	protected String name = "Mammal2";

	public Mammal2() {
		// super(1); // 부모의 생성자에 파라미터가 있을시 지정, 반드시 맨위에 있어야함
		System.out.println("Mammal2");
	}
}

class Whale2 extends Mammal2 {
	protected String name = "Whale2";

	public Whale2() {
		// super(); // 부모의 디폴트 생성자호출, 생략
		System.out.println("Whale2");
	}

	public void print() {
		String name = "print";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}