import java.util.Scanner;

public class TaskOne {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean running = true;
		int total = 0;

	    while(running){
		    for (int student = 1; student <= 10; student++) {
		    System.out.println("Please Provide Your Score" + student + ":");
		    int score = input.nextInt();
		    total += score;

			}

			System.out.println("Total score for all 10 students: " + total);
       		input.close();
			running = false;

		}
	
		

	}

}

