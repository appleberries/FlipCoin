import java.util.Scanner;

public class FlipCoinGame {

	public static void main(String[] args) {
		FlipCoinGameFunction theCoinGame = new FlipCoinGameFunction("Tom", "Max");
		String userAnswer;
		
		do {
			theCoinGame.startGame();
			
			System.out.print("Play again?: ");
			Scanner scan = new Scanner(System.in);
			userAnswer = scan.nextLine();
		}while(userAnswer.startsWith("y") || userAnswer.startsWith("Y"));
	}

}
