package oop;

import oop.pet.Whale;

public class Pet {
	public static void main(String[] args) {
		Whale whale = new Whale();
		whale.swimming();

		System.out.println(whale.mySum(1, 2));

		long long1 = 1;
		long long2 = 2;
		long sum2 = whale.mySum(long1, long2);
	}
}
