package nguyen_problem1;

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI2 {

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
	SecureRandom randCorrect = new SecureRandom();
	int respCorrect = 1 + randCorrect.nextInt(4);

	switch(respCorrect) {
	case 1: 
		System.out.println("Very good!");
		break;
	case 2:
		System.out.println("Excellent!");
		break;
	case 3:
		System.out.println("Nice work!");
		break;
	case 4:
		System.out.println("Keep up the good work!");
		break;
	}
}

public static void displayIncorrectResponse() {
	SecureRandom randIncorrect = new SecureRandom();
	int respIncorrect = 1 + randIncorrect.nextInt(4);
	
	switch(respIncorrect) {
	case 1:
		System.out.println("No. Please try again.");
		break;
	case 2:
		System.out.println("Wrong. Try once more.");
		break;
	case 3:
		System.out.println("Don't give up!");
		break;
	case 4:
		System.out.println("No. Keep trying.");
		break;
	}
}

}
