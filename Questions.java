package project;

import java.util.Scanner;

public class Questions {
		int life_line_count=3;
		int aud_phn=1;
		int ff=1;
		int skip=1;
		int money=1000;
		int total=0;
		Scanner sc = new Scanner(System.in);
		
		String white = "\033[37m";
		String red = "\033[31m";
		String magenta = "\033[35m";
		String black = "\033[30m";
		String blue = "\033[34m";
		String cyan = "\033[36m";
		String green = "\033[32m";
		String yellow = "\033[33m";
		String bggreen = "\033[102m";

	public boolean question1() {
		System.out.println(black+"A. What is india's national animal?\n"
				+ blue+"1. Elephant\n"
				+ "2. Lion\n"
				+ "3. Tiger\n"
				+ "4. Leapord\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 3) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 3) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				System.out.println("Enter your choice:");
				
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						 magenta+"1. Elephant\t---> 30%\n"
						+ "2. Lion\t---> 10%\n"
						+ "3. Tiger\t---> 45%\n"
						+ "4. Leapord\t---> 15%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 3) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(
						 magenta+ "3. Tiger\n"
						+ "4. Leapord\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 3) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}

	public boolean question2() {
		System.out.println(black+"B. What color is the sky on a clear day?\n"
				+blue+ "1. Blue\n"
				+ "2. Green\n"
				+ "3. red\n"
				+ "4. white\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 1) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				
				System.out.println("Enter your choice:");
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						 magenta+"1. Blue\t---> 45%\n"
						+ "2. Green\t---> 5%\n"
						+ "3. red\t---> 10%\n"
						+ "4. white\t---> 40%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 1) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(
						 magenta+ "1. Blue\n"
						+ "4. White\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 1) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if (choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}

	public boolean question3() {
		System.out.println(black+"C. How many legs does a spider have?\n"
				+blue+ "1. 6\n"
				+ "2. 8\n"
				+ "3. 10\n"
				+ "4. 12\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 2) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				
				System.out.println("Enter your choice:");
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(
						 magenta+ "1. 6\t---> 25%\n"
						+ "2. 8\t---> 50%\n"
						+ "3. 10\t---> 15%\n"
						+ "4. 12\t---> 10%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(
						magenta+  "1. 6\n"
						+ "2. 8\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}

	public boolean question4() {
		System.out.println(black+"D. Which fruit is typically yellow when ripe?\n"
				+blue+ "1. Apple\n"
				+ "2. Banana\n"
				+ "3. Cherry\n"
				+ "4. Orange\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 2) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				
				System.out.println("Enter your choice:");
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(magenta+
						  "1. Apple\t---> 30%\n"
						+ "2. Banana\t---> 50%\n"
						+ "3. Cherry\t---> 10%\n"
						+ "4. Orange\t---> 10%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(magenta+
						  "1. Apple\n"
						+ "2. Banana\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}

	public boolean question5() {
		System.out.println(black+"E.  What is the capital city of France?\n"
				+blue+ "1. Berlin\n"
				+ "2. Paris\n"
				+ "3. London\n"
				+ "4. Madrid\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 2) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				
				System.out.println("Enter your choice:");
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(magenta+
						  "1. Berlin\t---> 25%\n"
						+ "2. Paris\t---> 40%\n"
						+ "3. London\t---> 30%\n"
						+ "4. Madrid\t---> 5%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(magenta+
						  "2. Paris\n"
						+ "3. London\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}

	public boolean question6() {
		System.out.println(black+"F.  Which animal is known as the \"King of the Jungle\"?\n"
				+blue+ "1. Tiger\n"
				+ "2. Elephant\n"
				+ "3. Lion\n"
				+ "4. Bear\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 3) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 3) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				
				System.out.println("Enter your choice:");
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(magenta+
						  "1. Tiger\t---> 30%\n"
						+ "2. Elephant\t---> 20%\n"
						+ "3. Lion\t---> 45%\n"
						+ "4. Bear\t---> 5%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 3) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(magenta+
						  "1. Tiger\n"
						+ "3. Lion\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 3) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}

	public boolean question7() {
		System.out.println(black+"G.  Which shape has three sides?\n"
				+blue+ "1. Square\n"
				+ "2. Triangle\n"
				+ "3. circle\n"
				+ "4. Rectangle\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 2) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				
				System.out.println("Enter your choice:");
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(magenta+
						  "1. Square\t---> 25%\n"
						+ "2. Triangle\t---> 40%\n"
						+ "3. Circle\t---> 10%\n"
						+ "4. Rectangle\t---> 25%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(magenta+
						  "1. Square\n"
						+ "2. Triangle\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}

	public boolean question8() {
		System.out.println(black+"H.  What is the color of grass?\n"+blue
				+ "1. Blue\n"
				+ "2. Red\n"
				+ "3. Green\n"
				+ "4. Yellow\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 3) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 3) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				
				System.out.println("Enter your choice:");
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(magenta+
						  "1. Blue\t---> 15%\n"
						+ "2. Red\t---> 15%\n"
						+ "3. Green\t---> 40%\n"
						+ "4. Yellow\t---> 30%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 3) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(magenta+
						  "3. Green\n"
						+ "4. Yellow\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 3) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}

	public boolean question9() {
		System.out.println(black+"I.  Which season comes after winter?\n"
				+blue+ "1. Spring\n"
				+ "2. Summer\n"
				+ "3. Fall\n"
				+ "4. Autumn\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 1) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				
				System.out.println("Enter your choice:");
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(magenta+
						  "1. Spring\t---> 45%\n"
						+ "2. Summer\t---> 30%\n"
						+ "3. Fall\t---> 15%\n"
						+ "4. Autumn\t---> 10%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 1) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(magenta+
						  "1. Spring\n"
						+ "2. Summer\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 1) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}

	public boolean question10() {
		System.out.println(black+"J.  What is the main ingredient in guacamole?\n"
				+blue+ "1. Tomato\n"
				+ "2. Avocado\n"
				+ "3. Onion\n"
				+ "4. Carrot\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 2) {
			System.out.println(green+"Correct Answer...You have Won " + money);
			money = 1000;
			total = total +1000;
			return true;
		} else if (choice==5) {
			if(life_line_count==0) {
				System.out.println(red+"No Life Line is available"); 
				System.out.println(black+"please select the answer");
				choice = sc.nextInt();
				if(choice == 2) {
					System.out.println(green+"Correct Answer...You have Won " + money);
					money = 1000;
					total = total +1000;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println(cyan+"Avalilable life lines are : ");
				if(aud_phn==1) {
					System.out.println("---> 1. Audiance Phone : "+aud_phn+"\n");
				}
				if(ff==1) {
					System.out.println("---> 2. 50-50 : "+ff+"\n");
				}
				if(skip==1) {
					System.out.println("---> 3. Skip : "+skip);
				}
				
				System.out.println("Enter your choice:");
				do {
					choice = sc.nextInt();
					if((choice==1 && aud_phn==1) || (choice==2 && ff==1) || (choice==3 && skip==1)) {
						break;
					} else {
						System.out.println(red+"Invalid choice. Choose again :");
					}
				} while(true);
				
				if(choice == 1 && aud_phn==1) {
					aud_phn--;
					life_line_count--;
					System.out.println(magenta+
						  "1. Tomato\t---> 15%\n"
						+ "2. Avocado\t---> 55%\n"
						+ "3. Onion\t---> 20%\n"
						+ "4. Carrot\t---> 10%\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total +1000;
						return true;
					}
					else {
						return false;
					}
				} else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(cyan+"Two Incorrect options have been removed.");
					System.out.println(magenta+
						  "2. Avocado\n"
						+ "3. Onion\n");
					System.out.println("Please Select the answer");
					choice = sc.nextInt();
					if(choice == 2) {
						System.out.println(green+"Correct Answer...You have Won " + money);
						money = 1000;
						total = total+1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && skip==1) {
					skip=0;
					life_line_count--;
					return true;
				}
			}
		}
		return false;
	}
	
}
