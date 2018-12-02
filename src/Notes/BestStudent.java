import java.util.Scanner;
public class BestStudent {
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		
		double highscore = 0;
		String highscoreName = "";
		
		System.out.print("Enter the number of students:");
		int numStudent = input.nextInt();
		String temp = input.nextLine();//fix use a nextLine() call for the newline character
		for(int i = 0; i < numStudent; i++){
			System.out.println("Student "+ (i+1) + " of " + numStudent);
			System.out.print("Enter student's name:");
			String name = input.nextLine(); // at this line, the program breaks
			
			System.out.print("Enter student's score:");
			double score = input.nextDouble();
			temp = input.nextLine();//fix use a nextLine() call for the newline character
			if(highscore < score){
				highscore = score;
				highscoreName = name;
			}
		}
		
		System.out.println("The highest score was " + highscore + " and " + highscoreName + " got it");
	}
}
