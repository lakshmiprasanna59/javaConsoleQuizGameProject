package project;

import java.util.Scanner;

public class MainApp {
	
		static String white = "\033[37m";
		static String red = "\033[31m";
		static String magenta = "\033[35m";
		static String black = "\033[30m";
		static String blue = "\033[34m";
		static String cyan = "\033[36m";
		static String green = "\033[32m";
		static String yellow = "\033[33m";
		static String bggreen = "\033[102m";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(blue+"Welcome to Quiz Challenge."+blue);
		System.out.print(black+"Enter your name : ");
		String name = sc.next();
		System.out.println(red+"Hello " + name + " ! Do you want to see the rules?(Yes/No)");
		String r = sc.next();
		if (r.equalsIgnoreCase("yes")) {
			System.out.println(magenta+"Rules:");
			System.out.println(magenta+"1. You will be asked 10 questions.");
			System.out.println(magenta+"2. Each question has 4 options, with only one correct answer.");
			System.out.println(magenta+"3. You have 3 lifelines, which can be used only once:");
			System.out.println(magenta+"   a. 50-50: Eliminates two wrong answers.");
			System.out.println(magenta+"   b. Audience Poll: You can see what audience think correct option.");
			System.out.println(magenta+"   c. Skip: Skip to the next question.");
			System.out.println(magenta+"4. One wrong answer You will be eliminated.");
			System.out.println(red+"Do you wanna play?(yes/no)");
			r = sc.next();
			if (r.equalsIgnoreCase("yes")) {
				Questions q = new Questions();
				boolean res = q.question1();
				if (res == true) {
					res = q.question2();
					if (res == true) {
						res = q.question3();
						if (res == true) {
							res = q.question4();
							if (res == true) {
								res = q.question5();
								if (res == true) {
									res = q.question6();
									if (res == true) {
										res = q.question7();
										if (res == true) {
											res = q.question8();
											if (res == true) {
												res = q.question9();
												if (res == true) {
													res = q.question10();
												} else {
													System.out.println(red+"Wrong Answer. You are now Eliminated.");
													System.out.println(green+"Thanks for playing "+name+". You Won : " + q.total);
													System.exit(0);
												}
											} else {
												System.out.println(red+"Wrong Answer. You are now Eliminated.");
												System.out.println(green+"Thanks for playing "+name+". You Won : " + q.total);
												System.exit(0);
											}
										} else {
											System.out.println(red+"Wrong Answer. You are now Eliminated.");
											System.out.println(green+"Thanks for playing "+name+". You Won : " + q.total);
											System.exit(0);
										}
									} else {
										System.out.println(red+"Wrong Answer. You are now Eliminated.");
										System.out.println(green+"Thanks for playing "+name+". You Won : " + q.total);
										System.exit(0);
									}
								} else {
									System.out.println(red+"Wrong Answer. You are now Eliminated.");
									System.out.println(green+"Thanks for playing "+name+". You Won : " + q.total);
									System.exit(0);
								}
							} else {
								System.out.println(red+"Wrong Answer. You are now Eliminated.");
								System.out.println(green+"Thanks for playing "+name+". You Won : " + q.total);
								System.exit(0);
							}
						} else {
							System.out.println(red+"Wrong Answer. You are now Eliminated.");
							System.out.println(green+"Thanks for playing "+name+". You Won : " + q.total);
							System.exit(0);
						}
					} else {
						System.out.println(red+"Wrong Answer. You are now Eliminated.");
						System.out.println(green+"Thanks for playing "+name+". You Won : " + q.total);
						System.exit(0);
					}
				} else {
					System.out.println(red+"Wrong Answer");
					System.out.println(green+"Thanks for playing "+name+". You Won : " + q.total);
					System.exit(0);
				}
				System.out.println(green+"Congratulations "+name+". You  have completed the Quiz.");
				System.out.println(cyan+"You Won " + q.total);
				System.out.println(magenta+"Thanks for Playing...");
			} else {
				System.out.println(green+"Thank you " + name + "! See you again.");
			}
		} else {
			System.out.println(green+"Thank you " + name + "! See you again.");
		}
		sc.close();
	}

}
