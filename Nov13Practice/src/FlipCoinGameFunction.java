
public class FlipCoinGameFunction {
	Player[] players = new Player[2];
	Coin theCoin = new Coin();
	
	public FlipCoinGameFunction(String player1Name, String player2Name) {
		players[0] = new Player(player1Name);
		players[1] = new Player(player2Name);
	}
	
	public void startGame() {
		int randIndex = (Math.random() < 0.5) ? 0 : 1;
		String playersPick = players[randIndex].getRandomCoinOption(); // gives random player a random value(heads || tails)
		
		int opponentIndex = (randIndex == 0) ? 1 : 0; // gives opposite opponent 
		players[opponentIndex].setCoinOption(playersPick); // gives opposite value
		
		String winningFlip = theCoin.getCoinOption();
		players[0].didPlayerWin(winningFlip);
		players[1].didPlayerWin(winningFlip);
	}
}
