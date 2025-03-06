package oop.enumeration;

public class ExEnum {
	public static void main(String[] args) {
		Days day = Days.THURSDAY;
		System.out.println(day);
		System.out.println(day.getYoil());
	}
}

enum Days {
	SUNDAY("일요일", 0)
	,MONDAY("월요일", 1)
	,TUESDAY("화요일", 2)
	,WEDNESDAY("수요일", 3)
	,THURSDAY("목요일", 4)
	,FRIDAY("금요일", 5)
	,SATURDAY("토요일", 6);

	private final String yoil;
	private final int num;
	private Days(String yoil, int num) {
		this.yoil = yoil;
		this.num = num;
	}

	public String getYoil() {
		return this.yoil;
	}

	public int getNum() {
		return this.num;
	}
}