package javaPortfolio.BasicJava;

import java.util.Scanner;

/**
 * Objective In this challenge, we're going to learn about the difference
 * between a class and an instance; because this is an Object Oriented concept,
 * it's only enabled in certain languages. Check out the Tutorial tab for
 * learning materials and an instructional video!
 * 
 * Task Write a Person class with an instance variable, , and a constructor that
 * takes an integer, , as a parameter. The constructor must assign to after
 * confirming the argument passed as is not negative; if a negative argument is
 * passed as , the constructor should set to and print Age is not valid, setting
 * age to 0.. In addition, you must write the following instance methods:
 * 
 * yearPasses() should increase the instance variable by . amIOld() should
 * perform the following conditional actions: If , print You are young.. If and
 * , print You are a teenager.. Otherwise, print You are old.. To help you learn
 * by example and complete this challenge, much of the code is provided for you,
 * but you'll be writing everything in the future. The code that creates each
 * instance of your Person class is in the main method. Don't worry if you don't
 * understand it all quite yet!
 * 
 * Note: Do not remove or alter the stub code in the editor.
 * 
 * Input Format
 * 
 * Input is handled for you by the stub code in the editor.
 * 
 * The first line contains an integer, (the number of test cases), and the
 * subsequent lines each contain an integer denoting the of a Person instance.
 * 
 * Constraints
 * 
 * Output Format
 * 
 * Complete the method definitions provided in the editor so they meet the
 * specifications outlined above; the code to test your work is already in the
 * editor. If your methods are implemented correctly, each test case will print
 * or lines (depending on whether or not a valid was passed to the constructor).
 * 
 * @author mosesmanning
 *
 */
public class ClassVsInstance {

	private int age;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassVsInstance p = new ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}

	public ClassVsInstance(int initialAge) {
		// Add some more code to run some checks on initialAge
		age = initialAge;
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the
		// correct statement:
		String young = "You are young.";
		String teen = "You are a teenager.";
		String old = "You are old.";
		
		if (!(age > 0)) {
			age = 0;
			String zero = "Age is not valid, setting age to " + ClassVsInstance.this.age + ".";

			System.out.println(zero.trim());
		}

		if (age < 13) {
			System.out.println(young.trim());
		}

		if ((age >= 13) && (age < 18)) {
			System.out.println(teen.trim());
		}

		if (age >= 18) {
			System.out.println(old.trim());
		}
	}

	public void yearPasses() {
		// Increment this person's age.
		this.age++;
	}

}
