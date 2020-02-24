package nguyen_problem1;

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI4 {

	public static void main(String[] args) {
		quiz();

	}

public static void quiz() {
	int cont = 0;
	do {
	int grade = 0;
	int correct = 0;
	
	int diffLevel = readDifficulty();
	
	for(int i=0; i<10; i++) {
		int[] arguments = GenerateQuestionArgument(diffLevel);
		
		int number1 = arguments[0];
		int number2 = arguments[1];
		
		int CorrectAnswer = askQuestion(number1, number2);

		int UserAnswer = readResponse();
		grade = isAnswerCorrect(UserAnswer, CorrectAnswer);
		
		if(grade == 0) {
			displayIncorrectResponse();
		}
		
		if(grade == 1) {
			displayCorrectResponse();
			correct++;
		}
	}
	
	int score = (correct*100)/10;
	displayCompletionMessage(score);
	
	System.out.println("Do you want to solve a new problem set?\nEnter 1 for yes, 0 for no.");
	Scanner choice = new Scanner(System.in);
	cont = choice.nextInt();
	
} while(cont != 0);
}

public static int readDifficulty() {
	System.out.println("Choose a level of difficulty 1-4.");

	Scanner choiceDiff = new Scanner(System.in);
	int difficulty = choiceDiff.nextInt();
	
	return difficulty;
}

public static int[] GenerateQuestionArgument(int level) {
	int x = 0;
	int y = 0;
	SecureRandom values = new SecureRandom();
	
	switch(level) {
	case 1:
		x = values.nextInt(10);
		y = values.nextInt(10);
		break;
	case 2:
		x = values.nextInt(100);
		y = values.nextInt(100);
		break;
	case 3:
		x = values.nextInt(1000);
		y = values.nextInt(1000);
		break;
	case 4:
		x = values.nextInt(10000);
		y = values.nextInt(10000);
		break;
	}
		
	int arr[] = {x,y};
	return arr;
}

public static int askQuestion(int num1, int num2) {
	
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

public static void displayCompletionMessage(int pass) {
	System.out.println("Your score is: " + pass + "%");
	
	if(pass >= 75) {
		System.out.println("Congratulations, you are ready to go to the next level!");
	}
	
	if(pass < 75) {
		System.out.println("Please ask your teacher for extra help.");
	}
}

}
