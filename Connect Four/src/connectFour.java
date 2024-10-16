import java.util.Scanner;

public class connectFour
	{

		
		static String[][] board = new String[5][6];
		
		
		
			
		
		public static void main(String[] args)
			{
				
				
				
				greetUser();
				prepareBoard();
				displayBoard();
				
				
				placePiece();
				displayBoard();
				
				
				
				
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
		
		public static void prepareBoard()  //fills the board with empty spaces 
			{
			for(int row = 0; row < board.length; row++)
				{
				for(int col = 0; col < board[row].length; col++)
					{
						board[row][col] = " ";
					}
				}
			}

		public static void displayBoard() // displays board with empty spaces
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
				
				System.out.println();
				
				
			}
		
		public static void placePiece()
			{
				
//				int columnA = 4;
//				int columnB = 4;
//				int columnC = 4;
//				int columnD = 4;
//				int columnE = 4;
//				int columnF = 4;
				
				
				Scanner userInput = new Scanner (System.in);
				boolean playerOneMove = true;
				
				while(playerOneMove == true)
				{
					displayBoard();
					System.out.println("Player 1, which column do you want to put a piece in?");
					String answer = userInput.nextLine().toUpperCase();
					System.out.println("You chose " + answer);
					
					int column = answer;
					
					
				}
				
				
				
				
				
				
				
				
				
			
			}
		
		
		
		public static void playedBoard()
			{

			}

		public static void checkVerticalWin()
			{
			
			}
		
		public static void checkHorizontalWin()
			{
			
			}	
		
		public static void checkDiagonalWin()
			{
			
			}
		
	}







//outside of the main method, the 2D array "board" is created
// the board is prepared by making every space an empty space
// the board, with its empty spaces, is displayed before any moves have been made

// the difficulty first hits in the "playGame()" method - 
// a counter that starts at 4 is made for each column (the number represents the row that the piece will land in)
// each time a player chooses a column to drop their piece in to, the counter is reduced by 1 and the value for the space chosen on the board is returned
// the [row][col] format is [counter number][column that the player chose]
// I think this method is good for replacing one part of the board, but it might be hard to use this for both players and multiple moves
// it's also tricky returning the board with the new move in place - it doesn't even seem like it works when I say [4][0] instead of using the variable 
// i've researched and I can complete this using one display Board method

// once all of the playing components are figured out, a method for checking for a win needs to be coded. 
// we can deal with this later 










//old code

//if(answerOne == "A")
//	{
//		board[columnA][0] = "x";
//		columnA = columnA-1;
//		
//	}
//
//else if(answerOne == "B")
//	{
//		board[columnB][1] = "x";
//		columnB = columnB-1;
//		
//	}
//
//else if(answerOne == "C")
//	{
//		board[columnC][2] = "x";
//		columnC = columnC-1;
//		
//	}
//
//else if(answerOne == "D")
//	{
//		board[columnD][3] = "x";
//		columnD = columnD-1;
//		
//	}
//
//else if(answerOne == "E")
//	{
//		board[columnE][4] = "x";
//		columnE = columnE-1;
//		
//	}
//
//else if(answerOne == "F")
//	{
//		
//		board[columnF][5] = "x";
//		columnF = columnF-1;
//		
//	}




