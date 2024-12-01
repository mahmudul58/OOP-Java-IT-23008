//Mahmudul(IT23008)
import java.util.Scanner;
public class CGPA_and_Grad_calculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student ID: ");
        String studentID = sc.nextLine();
        System.out.print("No. of Courses: ");
        int nc = sc.nextInt();

        int totalCredits = 0;
        int totalCreditsEarned = 0;
        double totalGPA = 0;

        for (int i = 1; i <= nc; i++) {
            System.out.println("Course" + i + ":");
            System.out.print("Credit (Max 3): ");
            int credit = sc.nextInt();
            totalCredits += credit;
            System.out.print("Class test marks(Max 30): ");
            int ct = sc.nextInt();
            System.out.print("Attendance marks(Max 10): ");
            int at = sc.nextInt();
            System.out.print("Final exam  marks(Max 60): ");
            int fe = sc.nextInt();
            int totalMarks = ct + at + fe;
            double percentage = (totalMarks / 100.0) * 100;
            double gpa = 0;

            if (percentage >= 80) gpa = 4.0;        
            else if (percentage >= 75) gpa = 3.75;  
            else if (percentage >= 70) gpa = 3.5;   
            else if (percentage >= 65) gpa = 3.25;  
            else if (percentage >= 60) gpa = 3.0;   
            else if (percentage >= 55) gpa = 2.75;  
            else if (percentage >= 50) gpa = 2.5;   
            else if (percentage >= 45) gpa = 2.25;  
            else if (percentage >= 40) gpa = 2.0;   
            else gpa = 0.0;                      
            totalGPA += gpa * credit;
            if (gpa > 0) {
                totalCreditsEarned += credit;
            }
        }

        double cgpa = totalGPA / totalCredits;

        String grade;
        if (cgpa >= 4.0) grade = "A+";
        else if (cgpa >= 3.75) grade = "A";
        else if (cgpa >= 3.5) grade = "A-";
        else if (cgpa >= 3.25) grade = "B+";
        else if (cgpa >= 3.0) grade = "B";
        else if (cgpa >= 2.75) grade = "B-";
        else if (cgpa >= 2.5) grade = "C+";
        else if (cgpa >= 2.25) grade = "C";
        else if (cgpa >= 2.0) grade = "D";
        else grade = "F";

        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("Credit Earned: " + totalCreditsEarned);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
