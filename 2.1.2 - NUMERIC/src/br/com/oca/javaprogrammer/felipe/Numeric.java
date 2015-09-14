package br.com.oca.javaprogrammer.felipe;

public class Numeric {

	public static void main(String... args) {
		int a=100;
		int b=1_0_0;
		if(a==b){
			System.out.println("a and b are equal!!!");
		}
		//zeros on the left of the number converts it to octal base
		if(100!=0100){
			System.out.println("Adding an extra zero to the left changes the integer value");
			System.out.println(100+" is different than "+01   + " (01)");
			System.out.println(100+" is different than "+010  + " (010)");
			System.out.println(100+" is different than "+0100 + " (0100)");
		}
	}
}
