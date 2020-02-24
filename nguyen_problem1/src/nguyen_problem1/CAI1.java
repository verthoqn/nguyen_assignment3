package nguyen_problem1;

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1 {

	public static void main(String[] args) {
		quiz();

	}

public static void quiz() {
	int CorrectAnswer = askQuestion();
	int grade = 0;
	
	do {
		int UserAnswer = readResponse();
		grade = isAnswerCorrect(UserAnswer, CorrectAnswer);
		
		if(grade == 0) {
			displayIncorrectResponse();
		}
		
		if(grade == 1) {
			displayCorrectResponse();
		}
	} while(grade == 0);
}

public static int askQuestion() {
	int num1, num2;
	
	SecureRandom random = new SecureRandom();
	
	num1 = random.nextInt(10);
	num2 = random.nextInt(10);
	
	System.out.println("What is " + num1 + " times " + num2 + "?");
	
	return num1*num2;
}

public static int readResponse() {
	Scanner input = new Scanner(System.in);

	int ans = input.nextInt();
	
	return ans;
	
}

public static int isAnswerCorrect(int User, int Correct) {
	if (User == Correct) {
		return 1;
	}
	
	else
		return 0;
}

public static void displayCorrectResponse() {
	System.out.println("Very good!");
}

public static void displayIncorrectResponse() {
	System.out.println("No. Please try again.");
}

}
