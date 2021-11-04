public class HomeWorkApp {
	public static void main(String [] args) {
	printThreeWords();
	checkSumSign();
	printColor();
	compareNumbers();
	}
	public static void printThreeWords() {
	System.out.println("Orange");
	System.out.println("Banana");
	System.out.println("Apple");
	}
	static void checkSumSign() {
		int a = 10;
		int b = 30;
		int c = a + b;
		if (c >= 0) {
			System.out.println("Positive amount");
		} else {
			System.out.println("Negative amount");
		}
	}
	static void printColor() {
		int value = 5;
		if (value <= 0) {
			System.out.println("Red");
			} 
		if (value > 0 && value <= 100) {
				System.out.println("Yellow");
			}
		if (value > 100) {
			System.out.println("Green");
		}
	}
	static void compareNumbers() {
		int a = -5;
		int b = 10;
		/*if (a >= b) {
			System.out.println("a >= b")
		} else {
			System.out.println("a < b")
		}*/
		System.out.println(a >= b? "a >= b" : "a < b");
	}
}