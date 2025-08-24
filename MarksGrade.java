import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        double percentage = (physics + chemistry + maths) / 3;
        String grade, remarks;

        if (percentage >= 90) { grade = "A"; remarks = "Excellent"; }
        else if (percentage >= 75) { grade = "B"; remarks = "Very Good"; }
        else if (percentage >= 60) { grade = "C"; remarks = "Good"; }
        else if (percentage >= 50) { grade = "D"; remarks = "Average"; }
        else { grade = "F"; remarks = "Fail"; }

        System.out.println("Average Marks: " + percentage);
        System.out.println("Grade: " + grade + ", Remarks: " + remarks);
        sc.close();
    }
}
