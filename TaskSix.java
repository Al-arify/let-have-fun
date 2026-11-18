import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenSum = 0;
        int evenCount = 0;

        for (int student = 1; student <= 10; student++) {
            System.out.println("Please Provide Score for Student " + student + ":");
            int score = input.nextInt();

            if (score % 2 == 0) {
                evenSum += score;
                evenCount++;
            }
        }
        
        if (evenCount > 0) {
            double evenAverage = (double) evenSum / evenCount;
            System.out.println("Sum of even scores: " + evenSum);
            System.out.println("Average of even scores: " + evenAverage);
        } else {
            System.out.println("No even scores were entered.");
        }

        input.close();
    }
}
