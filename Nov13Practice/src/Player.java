
public class Player {
	private String name = "";
	private String coinOption = "";
	public String[] coinValue = {"Heads", "Tails"}; // would be better if ENUM was used
	
	public Player(String newName) {
		name = newName;
	}
	
//	public String getCoinOption() {
//		return coinOption;
//	}
	
	public void setCoinOption(String opponentFlip) {
		coinOption = (opponentFlip == "Heads") ? "Tails" : "Heads";
	}
	
	public String getRandomCoinOption() {
		int randNum = (Math.random() < 0.5) ? 0 : 1;
		coinOption = coinValue[randNum];
		return coinValue[randNum];
	}
	
	public void didPlayerWin(String winningFlip) {
		if(coinOption == winningFlip) {
			System.out.println(name + " won with a flip of " + coinOption + ".");
		}else {
			System.out.println(name + " lose with a flip of " + coinOption + ".");
		}
	}
}
