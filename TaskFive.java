import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenSum = 0;

        for (int student = 1; student <= 10; student++) {
            System.out.println("Please Provide Score for Student " + student + ":");
            int score = input.nextInt();

            if (score % 2 == 0) {
                evenSum += score;
            }
        }

        System.out.println("Sum of all even scores: " + evenSum);

        input.close();
    }
}
