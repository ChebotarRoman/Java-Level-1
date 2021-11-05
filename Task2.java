/**
* Java 1. Homework 2
*
* @author Chebotar Roman
* @version 5.11.2021
*/
class Task2 {
	public static void main(String[] args) {
	sumWholeNumbers(1, 3);
	sumWholeNumbers(10, 5);
	sumWholeNumbers(21, 43);
	transferredNumPosOrNeg (-7);
	transferredNumPosOrNeg (56);
	transferredWholeNum (101);
	transferredWholeNum (0);
	transferredWholeNum (-212);
	passString ();
	leapYear (88);
	leapYear (100);
	leapYear (400);
	leapYear (800);
	leapYear (99);
	leapYear (1000);
	leapYear (717);
    }
    
	static void sumWholeNumbers (int a, int b) {
	System.out.println(10 >= a + b && a + b <= 20? "true" : "false");
	}
	
	static void transferredNumPosOrNeg (int a) {
	/*if (a >= 0) {
	/	System.out.println("positive");
	} else {
		System.out.println("negative");
	}*/
	System.out.println("Number is " + (a >= 0? "positive" : "negative")); 
	}
	
	static void transferredWholeNum (int a) {
		System.out.println(a < 0? "true" : "false");
	}
	
    static void passString () {
		for (int x = 0; x < 5; x++) {
		System.out.println("Java1.Lesson2.Task4");
		}
	}
	
	static void leapYear (int a) {
		if (a % 4 == 0) {
		if ((a % 100 != 0) || (a % 400 == 0)) {
			System.out.println("true");
			} else {
			System.out.println("false");
			}
		}
	}
}