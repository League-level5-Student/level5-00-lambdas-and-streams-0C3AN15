package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String s2 = "";
			for(int i = s.length()-1; i >= 0; i--) {
				
				s2 = s2 + s.charAt(i);
			}
			System.out.println(s2);
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String s2 = "";
			String upper = s.toUpperCase();
			int count = 0;
			for(int i=0;i<s.length();i++) {
				if(count%2 == 0) {
					s2 = s2 + s.charAt(i);
				}
				else {
					s2 = s2 + upper.charAt(i);
				}
				count++;
			}
			System.out.println(s2);
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String s2 = "";
			for(int i=0;i<s.length();i++) {
				
				s2 = s2 + s.charAt(i) + ".";
			}
			System.out.println(s2);
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String s2 = "";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
					s2 = s2 + s.charAt(i);
				}
			}
			System.out.println(s2);
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
