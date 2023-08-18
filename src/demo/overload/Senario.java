package demo.overload;

public class Senario {

	public static void m1(int number) {

		System.out.println("m1 inside int number");
	}

	public static void m1(long number) {

		System.out.println("m1 inside long number");
	}

	public static void m1(Long number) {
				
		System.out.println("m1 inside Long  number");
	}

//	public static void m1(int... number) {
//
//		System.out.println("m1 inside int... number");
//	}

	public static void m1(long... number) {

		System.out.println("m1 inside long... number");
	}
	public static void m1(Long... number) {
		
		System.out.println("m1 inside Long... number");
	}

	public static void m1(int number1, int number2) {

		System.out.println("m1 inside int number,int number2");
	}

//	public static void m1(Integer[] number) {
//
//		System.out.println("m1 inside Integer[]");
//	}
//	public static void m1(Integer...number) {
//		
//		System.out.println("m1 inside Integer...number");
//	}

	public static void m1(char number) {
		System.out.println(" m1 inside char number");
	}
	
	public static void main(String[] args) {
		
		//Integer i =10;
		m1(10,20,30);
		
		
	}

}
