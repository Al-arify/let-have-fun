import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String evenIndex = "";

        for (int student = 1; student <= 10; student++) {
            System.out.println("Please Provide Score for Student " + student + ":");
            int score = input.nextInt();

           
            if (student % 2 == 0) {
                evenIndex += "Student " + student + ": " + score + "\n";
            }
        }

        System.out.println("\nScores at even positions (2nd, 4th, 6th, 8th, 10th):");
        System.out.print(evenIndex);

        input.close();
    }
}
