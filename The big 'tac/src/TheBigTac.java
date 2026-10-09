
import java.util.Scanner;
public class TheBigTac
	{
public static String[][] grid = new String[3][3];
		public static void main(String[] args)
			{	
			for (int column=0; column<3; column++) 
			{
				for (int row = 0; row <3; row++) 
				{
					grid[column][row] = " ";
				}
			}
				displayBoardInitial();
			}
		public static void displayBoardInitial()
			{
			Scanner input = new Scanner(System.in);
		System.out.println("TIC TAC TOE");
		System.out.println("-----------------------------------------------------------");
		System.out.println("  A" + "  B" + "  C");
		System.out.println("1" + "|" + grid [0][0] + "|" + grid [1][0] + " |" + grid [2][0] + " |");
		System.out.println("2" + "|" + grid [0][1] + "|" + grid [1][1] + " |" + grid [2][1] + " |");
		System.out.println("3" + "|" + grid [0][2] + "|" + grid [1][2] + " |" + grid [2][2] + " |");
		System.out.println("Input your move. (a1 for top left, b2 for middle, etc.)");
		String move1 = input.nextLine();
		if (move1.equals("a1")) 
		{
			grid[0][0] = "x";
			displayBoard();
		}
		
			}
		public static void displayBoard() 
		{
			System.out.println("-----------------------------------------------------------");
			System.out.println("  A" + "  B" + "  C");
			System.out.println("1" + "|" + grid [0][0] + "|" + grid [1][0] + " |" + grid [2][0] + " |");
			System.out.println("2" + "|" + grid [0][1] + "|" + grid [1][1] + " |" + grid [2][1] + " |");
			System.out.println("3" + "|" + grid [0][2] + "|" + grid [1][2] + " |" + grid [2][2] + " |");
			System.out.println("Input your move. (a1 for top left, b2 for middle, etc.)");
		}
		
	}
// something i guess