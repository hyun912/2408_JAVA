package oop.exextends;

public class ExExtends {
	public static void main(String[] args) {
	}
}

class Mammal {
	protected String name;
	protected String residence;
	protected final int age;

	public Mammal() {
		this.age = 0; // 파이널 상수는 생성자에서 초기화 하는편
	}

	public void breath() {
		System.out.println(this.name + "가 폐호흡합니다.");
	}
}

class Whale extends Mammal{
	public Whale(String name, String residence) {
		this.name = name;
		this.residence = residence;
	}

	@Override
	public void breath() {
		System.out.println("바나나 나나나");
	}
}
