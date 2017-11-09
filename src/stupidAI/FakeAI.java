package stupidAI;
import java.util.Scanner;
import java.lang.*;

public class FakeAI {
	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello! My name is Al the AI. Allen for long.");
		System.out.println("I'm actually not a real AI...");
		System.out.println("I'm just an implementation created for Arden to relearn how to use the");
		System.out.println("java scanner.");
		System.out.println("Maybe one day...I'll be a real AI...one day");
		System.out.println("Anyway, let's begin.");
		System.out.println("What is your name?");
		name = scan.nextLine();
		if(name.equals("Arden")) {
			System.out.println("Oh hey Arden! Make me a real AI one day?");
		}
		else if(name.equals("Chad")) {
			System.out.println("Haha...Chad..");
		}
		else if(name.equals("Jojo")) {
			System.out.println("Oraoraoraoraoraoraoraora");
		}
		else if(name.equals("Kakyoin")) {
			System.out.println("Lerolerolerolerolerolerolero");
		}
		else {
			System.out.println("So your name is " + name + "?");
		}
		/*scan.next();*/
		System.out.println("How old are you," + name + "?");
		age = scan.nextInt();
		/*scan.next();*/
		if(age == 69) {
			System.out.println("You have a dirty mind....or you're actually 69.");
		}
		else if (age == 420) {
			int count = 0;
			System.out.println("Blaze it.");
			System.out.println("But no really...what's your real age?");
			age = scan.nextInt();
			/*scan.next();*/
			while(age == 420) {
				if(count == 0) {
					System.out.println("Really? Are you gonna do this right now?");
					System.out.println("Try again.");
				}
				else if(count == 1) {
					System.out.println("If that's how you wanna play. Fine.");
					System.out.println("Try again.");
				}
				else if(count == 2) {
					System.out.println("We can do this all day.");
					System.out.println("Try again.");
				}
				else if(count > 2) {
					System.out.println("Try again.");
				}
				age = scan.nextInt();
				/*scan.next();*/
			}
			
		}
		else if (age > 100 && age != 420) {
			System.out.println("Wow...you're really old!");
		}
		else if(age <= 100) {
			System.out.println("You are " + age + " years old. Wow!");
		}
		System.out.println("I am going to sleep now. Goodbye!");
		scan.close();
	}
}
