import java.util.*;
public class gradeCalculator {
    

    
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
    
                // Input: Take marks obtained in each subject
                System.out.print("Enter number of subjects: ");
                int numSubjects = scanner.nextInt();
    
                int[] marks = new int[numSubjects];
                int totalMarks = 0;
    
                // Input marks for each subject
                for (int i = 0; i < numSubjects; i++) {
                    System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
                    marks[i] = scanner.nextInt();
                    totalMarks += marks[i];
                }
    
                // Calculate average percentage
                double averagePercentage = (double) totalMarks / numSubjects;
    
                // Grade Calculation: Assign grades based on average percentage
                char grade;
                if (averagePercentage >= 90) {
                    grade = 'A';
                } else if (averagePercentage >= 80) {
                    grade = 'B';
                } else if (averagePercentage >= 70) {
                    grade = 'C';
                } else if (averagePercentage >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
    
                // Display Results
                System.out.println("\nResults:");
                System.out.println("Total Marks: " + totalMarks);
                System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
                System.out.println("Grade: " + grade);
    
                scanner.close();
            }
        }
    
    
    
    

