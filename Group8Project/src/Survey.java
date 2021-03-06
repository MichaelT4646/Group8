import java.util.Scanner;

public class Survey {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println(
				"Hello, thank you for participating in this survey! \nPlease answer your questions on a scale from 0 being the worst and 10 being the best. \nPress any key to start the survey.");
		String question0Answer = keyboardInput.nextLine();
		int questionAnswers[] = new int[19];

		System.out.println("Question 1: How would you rate your experience on Quinnipiac is year?");
		int question1Answer = keyboardInput.nextInt();
		while (question1Answer > 10 || question1Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question1Answer = keyboardInput.nextInt();
		}
		questionAnswers[0] = question1Answer;

		System.out.println("Question 2: How would you rate your online class experience at Quinnipiac?");
		int question2Answer = keyboardInput.nextInt();
		while (question2Answer > 10 || question2Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question2Answer = keyboardInput.nextInt();
		}
		questionAnswers[1] = question2Answer;

		System.out.println("Question 3: How would you rate your in class experience at Quinnipiac?");
		int question3Answer = keyboardInput.nextInt();
		while (question3Answer > 10 || question3Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question3Answer = keyboardInput.nextInt();
		}
		questionAnswers[2] = question3Answer;

		System.out.println("Question 4: How would you rate your in class experience before Covid?");
		int question4Answer = keyboardInput.nextInt();
		while (question4Answer > 10 || question4Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question4Answer = keyboardInput.nextInt();
		}
		questionAnswers[3] = question4Answer;

		System.out.println("Question 5: How would you rate the food at Quinnipiac?");
		int question5Answer = keyboardInput.nextInt();
		while (question5Answer > 10 || question5Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question5Answer = keyboardInput.nextInt();
		}
		questionAnswers[4] = question5Answer;

		System.out.println("Question 6: How would you rate the food from your school before covid?");
		int question6Answer = keyboardInput.nextInt();
		while (question6Answer > 10 || question6Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question6Answer = keyboardInput.nextInt();
		}
		questionAnswers[5] = question6Answer;

		System.out.println("Question 7: How would you rate the clubs that you are in?");
		int question7Answer = keyboardInput.nextInt();
		while (question7Answer > 10 || question7Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question7Answer = keyboardInput.nextInt();
		}
		questionAnswers[6] = question7Answer;

		System.out.println("Question 8: How would you rate the clubs that you were in before Covid?");
		int question8Answer = keyboardInput.nextInt();
		while (question8Answer > 10 || question8Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question8Answer = keyboardInput.nextInt();
		}
		questionAnswers[7] = question8Answer;

		System.out.println("Question 9: How would you rate the activites offered by Quinnipiac?");
		int question9Answer = keyboardInput.nextInt();
		while (question9Answer > 10 || question9Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question9Answer = keyboardInput.nextInt();
		}
		questionAnswers[8] = question9Answer;

		System.out.println("Question 10: How would you rate the activites offered by your school before Covid?");
		int question10Answer = keyboardInput.nextInt();
		while (question10Answer > 10 || question10Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question10Answer = keyboardInput.nextInt();
		}
		questionAnswers[9] = question10Answer;

		System.out.println("Thank you for taking the time to complete this survey! It means a lot to us!");
		System.out.println("These are your answers!");
		int counter = 0;
		while (counter < questionAnswers.length) {
			System.out.println(questionAnswers[counter]);
			counter += 1;
		}
	}
}
