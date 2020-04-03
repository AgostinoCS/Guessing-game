import java.util.*;

public class Game {
	public static void main(String[] args) {
		int min=0, max=1000;
		int num = (int) (Math.random()*((max-min)+1))+min;
		int at = 0;
		while(true) {
			System.out.println("Attempts: "+at);
			System.out.println("Guess the number!");
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			if (n == num) {
				System.out.println("You win!");
				break;
			}
			if(n>num) {
				System.out.println("Too big!\n");
			}
			if (n<num) {
				System.out.println("Too small!\n");
			}
			at++;
		}
	}
}