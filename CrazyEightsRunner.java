/**
 * This is a class that plays the GUI version of the Crazy Eights game.
 * See accompanying documents for a description of how Crazy Eights is played.
 */
public class CrazyEightsRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new CrazyEightsBoard();
		CardGameGUI gui = new CardGameGUI(board);
		board.acknowledgeGUI(gui);
		gui.displayGame();
	}
}
