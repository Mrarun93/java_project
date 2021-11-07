package com.polymorphism;

public class Day4 {
	private void employee() {
		System.out.println("employee");
	}

	private void employee(int a) {
		System.out.println("employee" + a);
	}

	private void employee(String b, char c) {
		System.out.println("employee" + b + " " + c);
	}

	public static void main(String[] args, String arun, char c) {
Day4 a = new Day4();
a.employee();
a.employee(54);
a.employee(arun, c);
	}
	}
