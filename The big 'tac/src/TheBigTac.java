
public class TheBigTac
	{
public static String[][] grid = new String[3][3];
		public static void main(String[] args)
			{	
				displayBoard();
			}
		public static void displayBoard()
			{
		System.out.println("TIC TAC TOE");
		System.out.println("-----------------------------------------------------------");
		System.out.println("  A" + "  B" + "  C");
		System.out.println("1" + "|" + grid [0][0] + "|" + grid [1][0] + "|" + grid [2][0] + "|");
		System.out.println("2" + "|" + grid [0][1] + "|" + grid [1][1] + "|" + grid [2][1] + "|");
		System.out.println("3" + "|" + grid [0][2] + "|" + grid [1][2] + "|" + grid [2][2] + "|");
			}
		
	}
// something i guess