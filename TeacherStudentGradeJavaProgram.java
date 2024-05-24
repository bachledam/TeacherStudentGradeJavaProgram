import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		//INITIALIZES VARIABLES
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		int count = 0;
		int pass = 0;
		boolean done = false;
		double average = 0;
		boolean end_game = false;
		
		
		
		while (!end_game) {
			while (!done) {
				System.out.println("Enter Score (Enter -1 to Stop): "); //scans score
				int score = scan.nextInt();
				
				if (score == -1) { //CHECKS IF TERMINATE PROGRAM
					done = true;
					break;
				}	
				else if (score > 100 || score < 0) { //CHECKS FOR WRONG VALUE INPUT
					System.out.println("Score " + score + " Rejected");
				}
				else if (score >= 90) { //CHECKS IF A
					a = a+1;
					pass = pass+1;
					average = average + score;
					count = count + 1;
				}
				else if (score >= 80) { //CHECKS IF B
					b = b+1;
					pass = pass+1;
					average = average + score;
					count = count + 1;
				}
				else if (score >= 70) { //CHECKS IF C
					c = c+1;
					pass = pass+1;
					average = average + score;
					count = count + 1;
				}
				else if (score >= 60) { //CHECKS IF D
					d = d+1;
					average = average + score;
					count = count + 1;
				}
				else if (score < 60) { //CHECKS IF F
					f = f+1;
					average = average + score;
					count = count + 1;
				}
			}
			average = average / count;
			//REPORT DIISPLAYER
			System.out.println("Here is your report:");
			
			System.out.println("     -   A total of " + count + " scores entered " + pass + " of them are 70 or higher.");
		
			System.out.println("     -   Letter Grade distribution of the scores:");
			
			System.out.println("           -    "+a + " Students earned the grade of A (90-100)");
			System.out.println("           -    "+b + " Students earned the grade of B (80-89)");
			System.out.println("           -    "+c + " Students earned the grade of C (70-79)");
			System.out.println("           -    "+d + " Students earned the grade of D (60-69)");
			System.out.println("           -    "+f + " Students earned the grade of F (59 or below)");
			
			System.out.println("     -   The average score is: " + average);

			System.out.println("Would you like to process another class? (Y or N): ");
			String another = scan.next();
			//ASKS IF ANOTHER GAME WOULD LIKE TO BE PLAYED
			if(another.equals("y") || another.equals("Y")) {
				a = 0;
				b = 0;
				c = 0;
				d = 0;
				f = 0;
				count = 0;
				pass = 0;
				done = false;
				average = 0;
				end_game = false;
			}
			else {
				end_game = true;
			}
		}	
		scan.close();	
	}
}