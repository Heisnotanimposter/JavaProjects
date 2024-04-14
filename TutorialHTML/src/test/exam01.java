import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Question and answers
        String question = "What is the capital of France?";
        String[] options = {"1. Paris", "2. Madrid", "3. Berlin", "4. Rome"};
        int correctAnswer = 1; // Representing option 1 is the correct answer
        
        // Display the question and options to the user
        System.out.println(question);
        for(String option : options) {
            System.out.println(option);
        }
        
        // Ask the user to choose an option
        System.out.print("Enter your choice (1-4): ");
        int userChoice = scanner.nextInt();
        
        // Check if the answer is correct
        if(userChoice == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect! The correct answer is " + correctAnswer + ".");
        }
        
        // Close the scanner
        scanner.close();
    }
}
