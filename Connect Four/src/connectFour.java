import java.util.Scanner;

public class connectFour
	{

		
		static String[][] board = new String[5][6];
		
			
		
		public static void main(String[] args)
			{
				
				
				
				greetUser();
				prepareBoard();
				displayBoard();
				playGameOne();
				displayBoard();
				
				
				
				//playGameOne();
				
				
				
				
			}
		
		public static void greetUser() 
			{
			System.out.println("Hello, welcome to Connect Four!");
			System.out.println(" ");
			
			Scanner userInput = new Scanner (System.in);
			
			System.out.println("Player 1, your pieces will be indicated by 'x'");
			System.out.println(" ");
			
			System.out.println("Player 2, your pieces will be indicated by 'o'");
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
		
		public static void playGameOne()
			{
				
				int columnA = 4;
				int columnB = 4;
				int columnC = 4;
				int columnD = 4;
				int columnE = 4;
				int columnF = 4;
				
				
				Scanner userInput = new Scanner (System.in);
				System.out.println("Player 1, which column do you want to put a piece in?");
				String answerOne = userInput.nextLine();
				System.out.println("You chose " + answerOne);
				
				
				
				if(answerOne == "A")
					{
						board[columnA][0] = "x";
						columnA = columnA-1;
						
					}
				
				else if(answerOne == "B")
					{
						board[columnB][1] = "x";
						columnB = columnB-1;
						
					}
				
				else if(answerOne == "C")
					{
						board[columnC][2] = "x";
						columnC = columnC-1;
						
					}
				
				else if(answerOne == "D")
					{
						board[columnD][3] = "x";
						columnD = columnD-1;
						
					}
				
				else if(answerOne == "E")
					{
						board[columnE][4] = "x";
						columnE = columnE-1;
						
					}
				
				else if(answerOne == "F")
					{
						
						board[columnF][5] = "x";
						columnF = columnF-1;
						
					}
			
			}
		
	
	}







