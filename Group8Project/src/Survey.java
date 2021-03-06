import java.util.Scanner;
public class Survey {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in); 
		System.out.println("Hello, thank you for participating in this survey! \nPlease answer your questions on a scale from 0 being the worst and 10 being the best. \nPress any key to start the survey.");
		String question0Answer = keyboardInput.nextLine();
		
		System.out.println("Question 1: How would you rate your experience on Quinnipiac is year?");
		int question1Answer = keyboardInput.nextInt();
		while (question1Answer > 10 || question1Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question1Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Question 2: How would you rate your online class experience at Quinnipiac?");
		int question2Answer = keyboardInput.nextInt();
		while (question2Answer > 10 || question2Answer < 0)  {
			System.out.println("Please input a number between 0-10.");
			question2Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Question 3: How would you rate your in class experience at Quinnipiac?");
		int question3Answer = keyboardInput.nextInt();
		while (question3Answer > 10 || question3Answer < 0)  {
			System.out.println("Please input a number between 0-10.");
			question3Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Question 4: How would you rate your in class experience before Covid?");
		int question4Answer = keyboardInput.nextInt();
		while (question4Answer > 10 || question4Answer < 0)  {
			System.out.println("Please input a number between 0-10.");
			question4Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Question 5: How would you rate the food at Quinnipiac?");
		int question5Answer = keyboardInput.nextInt();
		while (question5Answer > 10 || question5Answer < 0)  {
			System.out.println("Please input a number between 0-10.");
			question5Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Question 6: How would you rate the food from your school before covid?");
		int question6Answer = keyboardInput.nextInt();
		while (question6Answer > 10 || question6Answer < 0)  {
			System.out.println("Please input a number between 0-10.");
			question6Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Question 7: How would you rate the clubs that you are in?");
		int question7Answer = keyboardInput.nextInt();
		while (question7Answer > 10 || question7Answer < 0)  {
			System.out.println("Please input a number between 0-10.");
			question7Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Question 8: How would you rate the clubs that you were in before Covid?");
		int question8Answer = keyboardInput.nextInt();
		while (question8Answer > 10 || question8Answer < 0)  {
			System.out.println("Please input a number between 0-10.");
			question8Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Question 9: How would you rate the activites offered by Quinnipiac?");
		int question9Answer = keyboardInput.nextInt();
		while (question9Answer > 10 || question9Answer < 0)  {
			System.out.println("Please input a number between 0-10.");
			question9Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Question 10: How would you rate the activites offered by your school before Covid?");
		int question10Answer = keyboardInput.nextInt();
		while (question10Answer > 10 || question10Answer < 0)  {
			System.out.println("Please input a number between 0-10.");
			question10Answer = keyboardInput.nextInt();
		}
		
		System.out.println("Thank you for taking the time to complete this survey! It means a lot to us!");
	}
}
