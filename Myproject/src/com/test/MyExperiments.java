package com.test;

public class MyExperiments {

	public static void Car(String model, String carName, int modelYear) {
		String m = model;
		String c = carName;
		int x = modelYear;
		System.out.println("Car Model: " + m);
		System.out.println("Name of the Car: " + c);
		System.out.println("Year of manufacturing: " + x);
	}

	public static void main(String[] args) {
		callAllCar();
	}

	public static void callAllCar() {
		myCar();
		sapanaCar();
		chunnuCar();
		snehalCar();
		yashCar();
	}

	public static void myCar() {
		System.out.println("My Car");
		Car("Hatchback", "Swift", 2021);
		System.out.println();

	}

	public static void sapanaCar() {
		System.out.println("Sapana's Car");
		Car("SUV", "Cullinan", 2020);
		System.out.println();

	}

	public static void chunnuCar() {
		System.out.println("Chunnu's Car");
		Car("Sedan", "620D-GT", 2019);
		System.out.println();
	}

	public static void snehalCar() {
		System.out.println("Snehal's Car");
		Car("Sedan", "Audi", 2018);
		System.out.println();
	}

	public static void yashCar() {
		System.out.println("Yashpal's Car");
		Car("SUV", "G-Wagon", 2021);
		System.out.println();

	}
}
