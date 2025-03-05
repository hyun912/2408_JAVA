package oop.Polymorphism;

public class ExPolymorphism {
	public static void main(String[] args) {
		Whale whale1 = new Whale();
		whale1.birth();
		whale1.swimming();
		Mammal whale2 = new Whale();
		whale2.birth();
		// whale2.swimming(); // 마멀에 있는것만 부를수 있음

		Whale mammal = (Whale) whale2; // 다운캐스팅

		Mammal[] mammals = {new Whale(), new Whale(), new Squirrel()};

		Whale testWhale = (Whale) mammals[0];
		testWhale.swimming();
	}
}

class Mammal {
	public void birth() {
		System.out.println("출산");
	}
}
class Whale extends Mammal {
	public void swimming() {
		System.out.println("수영");
	}
}

class Squirrel extends Mammal {
	public void flying() {
		System.out.println("람쥐썬더!");
	}
}
