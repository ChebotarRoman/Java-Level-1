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
	transferredNumPosOrNeg(-7);
	transferredNumPosOrNeg(56);
	transferredWholeNum(101);
	transferredWholeNum(0);
	transferredWholeNum(-212);
	passString("lesson2. Task4", 5);
	System.out.println(leapYear(88));
	System.out.println(leapYear (100));
	System.out.println(leapYear (400));
	System.out.println(leapYear (800));
	System.out.println(leapYear (99));
	System.out.println(leapYear (1000));
	System.out.println(leapYear (717));
    }
    
	static boolean sumWholeNumbers (int a, int b) {
		return 10 >= a + b && a + b <= 20;
	}
	
	static void transferredNumPosOrNeg (int a) {
		System.out.println("Number is " + (a >= 0? "positive" : "negative")); 
	}
	
	static boolean transferredWholeNum (int a) {
		return a < 0;
	}
	
    static void passString(String x, int count) {
		for (int i = 0; i < count; i++) {
		System.out.println(x);
		}
	}
	
	static boolean leapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}
}