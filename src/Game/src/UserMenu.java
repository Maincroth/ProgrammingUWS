
	
public class UserMenu {
	
	public static void main ( String [] args){
		int Choice = 0;
		
		do{
				TextIO.putln(" Welcome");
				
				TextIO.putln("Please choose from the following options:");
				TextIO.putln("1. New Game");
				TextIO.putln("2. Continue Game");
				TextIO.putln("3. Exit");
				
				Choice = TextIO.getInt(); 
				if (Choice==1 ){
						CreateGame();
					}
				if  (Choice==2)	{
						TextIO.putln("Option 2");
					}
				if  (Choice==3)	{
						TextIO.putln("Option 3");
					}
			}while(Choice != 3);   //loops until the user chooses 3 to exit 
		}//main
		
		public static void CreateGame (){
			    //int Total;
				TextIO.putln("Welcome");
				String[] PlayerName = new String[5]; 

				PlayerName [0] =TextIO.getlnString();
			    TextIO.putln("EnterPlayer1 Name");
				PlayerName [1] =TextIO.getln();

				TextIO.putln("Player1 is "+PlayerName[1]);
				TextIO.putln("EnterPlayer2 Name");
				
				PlayerName [2] =TextIO.getlnString();
				
				TextIO.putln("Player2 is "+PlayerName[2]);
				TextIO.putln("EnterPlayer3 Name");
				PlayerName [3] =TextIO.getlnString();
			
				TextIO.putln("Player3 is "+PlayerName[3]);
				TextIO.putln("EnterPlayer4 Name");
				PlayerName [4] =TextIO.getlnString();
			
				TextIO.putln("Player4 is "+PlayerName[4]);
				Probability.ThrowTest1();
		}//CreateGame
		// left this alone as it works will work on the saving data aspect next

	}//UserMenu
