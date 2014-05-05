public class UserMenu {

	public static void main(String[] args) {
		int Choice = 0;

		do {
			TextIO.putln("Welcome");

			TextIO.putln("Please choose from the following options:");
			TextIO.putln("1. New Game");
			TextIO.putln("2. Continue Game");
			TextIO.putln("3. Exit");

			Choice = TextIO.getInt();
			if (Choice == 1) {
				CreateGame();
			}
			if (Choice == 2) {
				TextIO.putln("Option 2");
			}
			if (Choice == 3) {
				TextIO.putln("Option 3");
			}
		} while (Choice != 3); // loops until the user chooses 3 to exit
	}// main

	public static void CreateGame() {
		// int Total;
		// Turn[] ListOfTurns = new Turn[4];

		TextIO.putln("Welcome");
		String[] PlayerName = new String[4];

		for (int i = 0; i < 4; i++) {
			TextIO.putln("EnterPlayer " + (i + 1) + " Name");
			PlayerName[i] = TextIO.getln();
			
		}
		for (int i = 0; i < 4; i++) {
			TextIO.putln("Player " + i + 1 + " is " + PlayerName[i]);
		}

		Probability.ThrowTest1();
	}// CreateGame
		// left this alone as it works will work on the saving data aspect next

	// UserMenu

	// example of turn class

	// public class void Turn()
	// {}

	// public static int numberOfTurns = 0;
	// public int Score;
}
