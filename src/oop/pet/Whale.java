package oop.pet;

public class Whale {
	// 프로퍼티 : 클래스 안에 선언된 변수들
	// 메소드 : 클래스 안에 선언된 함수들\
	// public static String name; // 클래스 변수
	private int age; // 인스턴스 변수
	private String name;

	// 생성자 : 클래스가 인스턴스화할때 딱 한번 실행되는 메소드
	public Whale() {
		this(10);
	}
	public Whale(int age) {
		this(age, "John");
	}
	public Whale(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void swimming() {
		String test = "test"; // 지역 변수
		System.out.println("Swimming");
	}

	public int mySum(int a, int b) {
		return a + b;
	}
	// 오버로딩, 같은 이름으로 타입만 바꿔서 만들수있음
	public long mySum(long a, long b) {
		return a + b;
	}
}
