import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;



public class Survey extends JFrame{
	

	public Survey() {
		super("Survey");
        this.setSize(2000, 2000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // create a jpanel and add it to the frame
        this.add(new DrawingPanel());

        this.setVisible(true);
	}
	
	

	
	public static int[] readAverageSurvey(String filename) {
		
		String inputLine;
		File inFile = new File(filename); // creates variable for text file name
		ArrayList<String> list = new ArrayList<String>();
		if (inFile.exists()) {
			Scanner fileInput;
			try {
				fileInput = new Scanner(inFile).useDelimiter(",\\s*");
				
				while(fileInput.hasNext()) {
					inputLine = fileInput.next();
					//System.out.println(inputLine);
					list.add(inputLine);
				}
				
				//Collections.sort(list);
				//System.out.println("list size " + list.size());
				int[] array = new int[list.size()];
				for(int k = 0; k < array.length; k++) {
					
					array[k] = (Integer.parseInt(list.get(k)));
				}
				System.out.println("Read Average Answers: " + Arrays.toString(array).replace("[", "").replace("]", ""));  //remove the left and right bracket);
		        /*for(int k = 0; k < array.length; k++) {
					
					System.out.println(array[k]);
				}*/
	
	

				fileInput.close();
				return array;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				System.exit(1);
			}	
		} else {
			int[] array = new int[0];
			System.out.println("Read Average Answers: None Exists"); 
			return array;
		}	
		int[] array = new int[0];
		System.out.println("Read Average Answers: None Exists"); 
		return array;
	}
	
	public static void writeAverageSurvey(String filename, int[] userAnswers, int[] averageAnswers) {
		File tempFile = new File(filename); // creates variable for text file name
		boolean createdNewAverage = false;
		//if (tempFile.exists()) { 
		FileWriter PrintWriter;
		try {
			PrintWriter = new FileWriter(tempFile);
			if (averageAnswers.length == 0) {
				averageAnswers = new int[userAnswers.length];
				createdNewAverage = true;
			}
				
			for(int k = 0; k < userAnswers.length; k++) {
				if (createdNewAverage) {
					averageAnswers[k] = userAnswers[k];
				} else {
					averageAnswers[k] = (userAnswers[k] + averageAnswers[k]) / 2;
				}
				//System.out.println("userAnswer: " + userAnswers[k] + "| averageAnswers: " + averageAnswers[k]);
			}
			System.out.println("Writing Average Answers: " + Arrays.toString(averageAnswers).replace("[", "").replace("]", ""));  //remove the left and right bracket);
			
			PrintWriter.write(Arrays.toString(averageAnswers).replace("[", "").replace("]", ""));
			PrintWriter.close();
			//System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println(e);
			System.exit(1);
			e.printStackTrace();
			//System.out.println("An error occurred.");
		} // creates variable for text file name
		//} else {
		//	System.out.println("ERROR: " + filename + " not found.");
		//}	
	}
	
	
	
	public static void main(String[] args) {
		
		new Survey();
		
		

		int i, i2, i3, j;

		Scanner keyboardInput = new Scanner(System.in);
		System.out.println(
				"Hello, thank you for participating in this survey! \nPlease answer your questions on a scale from 0 being the worst and 10 being the best. \nPress any key to start the survey.");
		String question0Answer = keyboardInput.nextLine();
		int questionAnswers[] = new int[19];

		System.out.println("Question 1: How would you rate the campus life at Quinnipiac this year?");
		int question1Answer = keyboardInput.nextInt();
		while (question1Answer > 10 || question1Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question1Answer = keyboardInput.nextInt();
		}
		questionAnswers[0] = question1Answer;

		System.out.println("Question 2: How would you rate the atmosphere of your school before Covid?");
		int question2Answer = keyboardInput.nextInt();
		while (question2Answer > 10 || question2Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question2Answer = keyboardInput.nextInt();
		}
		questionAnswers[1] = question2Answer;

		System.out.println("Question 3: How would you rate your online class experience at Quinnipiac?");
		int question3Answer = keyboardInput.nextInt();
		while (question3Answer > 10 || question3Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question3Answer = keyboardInput.nextInt();
		}
		questionAnswers[2] = question3Answer;

		System.out.println("Question 4: How would you rate your in class experience at Quinnipiac?");
		int question4Answer = keyboardInput.nextInt();
		while (question4Answer > 10 || question4Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question4Answer = keyboardInput.nextInt();
		}
		questionAnswers[3] = question4Answer;

		System.out.println("Question 5: How would you rate your in class experience before Covid?");
		int question5Answer = keyboardInput.nextInt();
		while (question5Answer > 10 || question5Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question5Answer = keyboardInput.nextInt();
		}
		questionAnswers[4] = question5Answer;

		System.out.println("Question 6: How would you rate the food at Quinnipiac?");
		int question6Answer = keyboardInput.nextInt();
		while (question6Answer > 10 || question6Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question6Answer = keyboardInput.nextInt();
		}
		questionAnswers[5] = question6Answer;

		System.out.println("Question 7: How would you rate the food from your school before Covid?");
		int question7Answer = keyboardInput.nextInt();
		while (question7Answer > 10 || question7Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question7Answer = keyboardInput.nextInt();
		}
		questionAnswers[6] = question7Answer;

		System.out.println("Question 8: How would you rate the clubs that you are in?");
		int question8Answer = keyboardInput.nextInt();
		while (question8Answer > 10 || question8Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question8Answer = keyboardInput.nextInt();
		}
		questionAnswers[7] = question8Answer;

		System.out.println("Question 9: How would you rate the clubs that you were in before Covid?");
		int question9Answer = keyboardInput.nextInt();
		while (question9Answer > 10 || question9Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question9Answer = keyboardInput.nextInt();
		}
		questionAnswers[8] = question9Answer;

		System.out.println("Question 10: How would you rate the activites offered by Quinnipiac?");
		int question10Answer = keyboardInput.nextInt();
		while (question10Answer > 10 || question10Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question10Answer = keyboardInput.nextInt();
		}
		questionAnswers[9] = question10Answer;

		System.out.println("Question 11: How would you rate the activites offered by your school before Covid?");
		int question11Answer = keyboardInput.nextInt();
		while (question11Answer > 10 || question11Answer < 0) {
			System.out.println("Please input a number between 0-10.");
			question11Answer = keyboardInput.nextInt();
		}
		questionAnswers[10] = question11Answer;

		System.out.println("Thank you for taking the time to complete this survey! It means a lot to us!");
		System.out.println("These are your answers!");
		int counter = 0;
		while (counter < questionAnswers.length) {
			//System.out.println(questionAnswers[counter]);
			counter += 1;
		}

		System.out.println("Here are some statistics about your answers!");
		System.out.println(" ");

		int AverageBeforeCovid = (questionAnswers[1] + questionAnswers[4] + questionAnswers[6] + questionAnswers[8]
				+ questionAnswers[10]) / 5;
		int AverageAfterCovid = (questionAnswers[0] + questionAnswers[2] + questionAnswers[3] + questionAnswers[5]
				+ questionAnswers[7] + questionAnswers[9]) / 6;

		System.out.println("Your average score for questions before Covid was " + AverageBeforeCovid + ".");
		System.out.println("Your average score for questions after Covid was " + AverageAfterCovid + ".");

		int highestScore = questionAnswers[0];
		int highestQuestionNumber = 0;
		for (i = 0; i < questionAnswers.length; i++) {
			if (highestScore < questionAnswers[i]) {
				highestScore = questionAnswers[i];
				highestQuestionNumber = i;
			}
		}
		System.out.println("The highest score you gave was " + highestScore + " and you gave it for question "
				+ highestQuestionNumber + ".");

		int lowestScore = questionAnswers[0];
		int lowestQuestionNumber = 0;
		for (i2 = 0; i2 < questionAnswers.length; i2++) {
			if (lowestScore > questionAnswers[i2]) {
				lowestScore = questionAnswers[i2];
				lowestQuestionNumber = i2;
			}
		}
		System.out.println("The lowest score you gave was " + lowestScore + " and you gave it for question "
				+ lowestQuestionNumber + ".");

		int range = highestScore - lowestScore;

		System.out.println("The range of your scores was " + range + ".");

		int median = 0;
		int n = questionAnswers.length;
		if (n % 2 == 1) {
			median = questionAnswers[(n + 1) / 2 - 1];
		} else {
			median = (questionAnswers[n / 2 - 1] + questionAnswers[n / 2]) / 2;
		}
		System.out.println("The median of your scores is " + median + ".");

		int mode = 0;
		for (i3 = 0; i3 < questionAnswers.length; i3++) {
			int count = 0;
			int maxOccured = 0;
			for (j = 0; j < questionAnswers.length; j++) {
				if (questionAnswers[i3] == questionAnswers[j]) {
					count++;
				}

				if (maxOccured < count) {
					maxOccured = count;
					mode = questionAnswers[i3];
				}
			}
		}
		System.out.println("The score you gave the most was " + mode + ".");
		System.out.println(" ");
		System.out.println("Thank you again for taking our survey! We hope to see you again! :)");
	
		System.out.print("[OLD] ");
		writeAverageSurvey("SurveyAnswers.txt", questionAnswers, readAverageSurvey("SurveyAnswers.txt"));
		System.out.print("[NEW] ");
		readAverageSurvey("SurveyAnswers.txt");
		
	
	}

}
