import java.util.Scanner;

public class connectFour
	{

		
		static String[][] board = new String[5][6];
		
		public static void main(String[] args)
			{
				greetUser();
				prepareBoard();
				displayBoard();
				playGame();
				
				
				
				
			}
		
		public static void greetUser() 
			{
			System.out.println("Hello, welcome to Connect Four!");
			System.out.println(" ");
			
			Scanner userInput = new Scanner (System.in);
			System.out.println("Player 1, please enter your name:");
			String nameOne = userInput.nextLine();
			System.out.println("Hello, " + nameOne);
			System.out.println("Your pieces will be indicated by 'x'");
			System.out.println(" ");
			
			System.out.println("Player 2, please enter your name:");
			String nameTwo = userInput.nextLine();
			System.out.println("Hello, " + nameTwo);
			System.out.println("Your pieces will be indicated by 'o'");
			System.out.println(" ");
			
			System.out.println("Press enter to see the Connect Four board.");
			String go = userInput.nextLine();
			System.out.println();
			

			
			}
		
		public static void prepareBoard()
		{
			for(int row = 0; row < board.length; row++)
				{
				for(int col = 0; col < board[row].length; col++)
					{
						board[row][col] = " ";
					}
				}
		}

		public static void displayBoard()
			{
				
				System.out.println("   A   B   C   D   E   F");
				System.out.println(" -------------------------");
				System.out.println(" | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | " + board[0][3] + " | " + board[0][4] + " | " + board[0][5] + " | ");
				System.out.println(" -------------------------");
				System.out.println(" | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | " + board[1][3] + " | " + board[1][4] + " | " + board[1][5] + " | ");
				System.out.println(" -------------------------");
				System.out.println(" | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | " + board[2][3] + " | " + board[2][4] + " | " + board[2][5] + " | ");
				System.out.println(" -------------------------");
				System.out.println(" | " + board[3][0] + " | " + board[3][1] + " | " + board[3][2] + " | " + board[3][3] + " | " + board[3][4] + " | " + board[3][5] + " | ");
				System.out.println(" -------------------------");
				System.out.println(" | " + board[4][0] + " | " + board[4][1] + " | " + board[4][2] + " | " + board[4][3] + " | " + board[4][4] + " | " + board[4][5] + " | ");
				System.out.println(" -------------------------");
			}
		
		public static void playGame()
			{
				//row counter set to 4
				
				//when you 
				//[]rowCounter
				// 5 variables
			
			}
	}







