
import java.util.Scanner;
public class TheBigTac
	{
public static String[][] grid = new String[3][3];
public static int a1Stat = 0;
public static int a2Stat = 0;
public static int a3Stat = 0;
public static int b1Stat = 0;
public static int b2Stat = 0;
public static int b3Stat = 0;
public static int c1Stat = 0;
public static int c2Stat = 0;
public static int c3Stat = 0;
public static boolean win = false;
		public static void main(String[] args)
			{	
			for (int column=0; column<3; column++) 
			{
				for (int row = 0; row <3; row++) 
				{
					grid[column][row] = " ";
				}
			}
				displayBoard();
			}
	
		public static void displayBoard() 
		{
			for (int count = 0; count<4; count++) {
				 if ((a1Stat == 1 && b1Stat ==1 && c1Stat==1) || (a1Stat == 1 && a2Stat ==1 && a3Stat == 1) || (b1Stat == 1 && b2Stat ==1 && b3Stat == 1) || (c1Stat == 1 && c2Stat ==1 && c3Stat == 1) || (a2Stat == 1 && b2Stat ==1 && c2Stat==1) || (a3Stat == 1 && b3Stat ==1 && c3Stat==1) || (a1Stat ==1 && b2Stat ==1 && c3Stat ==1) || (a3Stat ==1 && b2Stat==1 && c1Stat==1)) 
					{
						win = true;
						System.out.println("-----------------------------------------------------------");
						System.out.println("youre win                              good job");
						break;
					}
				Scanner input = new Scanner(System.in);
			System.out.println("-----------------------------------------------------------");
			System.out.println("  1" + " 2" + " 3");
			System.out.println("A" + "|" + grid [0][0] + "|" + grid [1][0] + "|" + grid [2][0] + "|");
			System.out.println("B" + "|" + grid [0][1] + "|" + grid [1][1] + "|" + grid [2][1] + "|");
			System.out.println("C" + "|" + grid [0][2] + "|" + grid [1][2] + "|" + grid [2][2] + "|");
			System.out.println("Input your move. (a1 for top left, b2 for middle, etc.)");
			String move = input.nextLine();
			
			if (move.equals("a1") && a1Stat == 0) 
				{
					grid[0][0] = "x";
					a1Stat++;
					botTurn();
					displayBoard();
				}
				else if (move.equals("a2") && a2Stat == 0) 
					{
						grid[1][0] = "x";
						a2Stat++;
						botTurn();
						displayBoard();
					}
				else if (move.equals("a3") && a3Stat == 0) 
					{
						grid[2][0] = "x";
						a3Stat++;
						botTurn();
						displayBoard();
					}
				else if (move.equals("b1") && b1Stat == 0) 
					{
						grid[0][1] = "x";
						b1Stat++;
						botTurn();
						displayBoard();
					}
				else if (move.equals("b2") && b2Stat == 0) 
					{
						grid[1][1] = "x";
						b2Stat++;
						botTurn();
						displayBoard();
					}
				else if (move.equals("b3") && b3Stat == 0) 
					{
						grid[2][1] = "x";
						b3Stat++;
						botTurn();
						displayBoard();
					}
				else if (move.equals("c1") && c1Stat == 0) 
					{
						grid[0][2] = "x";
						c1Stat++;
						botTurn();
						displayBoard();
					}
				else if (move.equals("c2")&& c2Stat == 0) 
					{
						grid[1][2] = "x";
						c2Stat++;
						botTurn();
						displayBoard();
					}
				else if (move.equals("c3")&& c3Stat == 0) 
					{
						grid[2][2] = "x";
						c3Stat++;
						botTurn();
						displayBoard();
					}
				
				
				else {curseTheeNumber2();}

			lastTurn();
			}
			 
		}
		public static void curseThee() 
			{
				System.out.println("PICK A VALID MOVE, EVIL ONE!");
				
			}
		public static void curseTheeNumber2() 
			{
				System.out.println("PICK A VALID MOVE, EVIL ONE!");
				displayBoard();
			}
		public static void botTurn() 
		    {
		        if (win) {
		            return;
		        }
		        
		        int row = (int)(Math.random() * 3);
		        int col = (int)(Math.random() * 3);
		        
		        if (grid[row][col].equals(" "))
		            {
		            grid[row][col] = "o";	
		            }
		        else 
		            {
		                botTurn();
		            }
		    }
		public static void lastTurn()
			{
				Scanner input = new Scanner(System.in);
				System.out.println("-----------------------------------------------------------");
				System.out.println("  1" + " 2" + " 3");
				System.out.println("A" + "|" + grid [0][0] + "|" + grid [1][0] + "|" + grid [2][0] + "|");
				System.out.println("B" + "|" + grid [0][1] + "|" + grid [1][1] + "|" + grid [2][1] + "|");
				System.out.println("C" + "|" + grid [0][2] + "|" + grid [1][2] + "|" + grid [2][2] + "|");
				System.out.println("Input your move. (a1 for top left, b2 for middle, etc.)");
				String move = input.nextLine();
				if (move.equals("a1") && a1Stat == 0) 
					{
						grid[0][0] = "x";
						a1Stat++;
						displayBoard();
					}
					else if (move.equals("a2") && a2Stat == 0) 
						{
							grid[1][0] = "x";
							a2Stat++;
							displayBoard();
						}
					else if (move.equals("a3") && a3Stat == 0) 
						{
							grid[2][0] = "x";
							a3Stat++;
							displayBoard();
						}
					else if (move.equals("b1") && b1Stat == 0) 
						{
							grid[0][1] = "x";
							b1Stat++;
							displayBoard();
						}
					else if (move.equals("b2") && b2Stat == 0) 
						{
							grid[1][1] = "x";
							b2Stat++;
							displayBoard();
						}
					else if (move.equals("b3") && b3Stat == 0) 
						{
							grid[2][1] = "x";
							b3Stat++;
							displayBoard();
						}
					else if (move.equals("c1") && c1Stat == 0) 
						{
							grid[0][2] = "x";
							c1Stat++;
							displayBoard();
						}
					else if (move.equals("c2")&& c2Stat == 0) 
						{
							grid[1][2] = "x";
							c2Stat++;
							displayBoard();
						}
					else if (move.equals("c3")&& c3Stat == 0) 
						{
							grid[2][2] = "x";
							c3Stat++;
							displayBoard();
						}
					
					
					else {curseTheeNumber2();}
			}		
		
	}
// something i guess