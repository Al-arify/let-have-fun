import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int student = 1; student <= 10; student++) {
            System.out.println("Please Provide Score for Student " + student + ":");
            int score = input.nextInt();
            total += score;
        }
        double average = total / 10.0;

        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);
        
        input.close();
    }
}
