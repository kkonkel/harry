import java.util.ArrayList;
import java.util.Scanner;


public class Spellrunner

	{	
		static int counter = 1;
		public static void main(String[] args)
		{
			
			
			Book.pickSpell();
			Spell spell1 = Book.book.get(0);
			Book.pickSpell();
			Spell spell2 = Book.book.get(0);
					System.out.println("You are casting " + spell1.getName()+ " which has a magic value of " + spell1.getValue() + " and this spells purpose is to "   + spell1.getAbility());
				    System.out.println("Your opponent is casting " + spell2.getName() + " which has a magic value of " + spell2.getValue() + " and this spells purpose is to " + spell2.getAbility());
		if (spell1.getValue()> spell2.getValue())
			{
				System.out.println("Your spell has a greater value, you win. " );
				System.out.println("YOU WIN");
				
				
				
			}
		else if (spell1.getValue()< spell2.getValue())
			{
				System.out.println("Your opponents spell has a greater value, your opponent wins. ");
				System.out.println("YOU LOSE");
				
				
			}
		else if (spell1.getValue()== spell2.getValue())
			{
				System.out.println("You and your opponent have equally powerful spells. In a rare case like this, neither you or your opponent will win, because you have equal magical power. You will be asked to cast a random spell, and your opponent will cast a random spell aswell. Whoevers spell has a greater value, will automatically win the game.");
			
			Scanner userInput = new Scanner (System.in);
		    System.out.println ("What spell would you like to cast?");
		    Book.listBook();
		    String next = userInput.nextLine();
		    
		 
		    
		
		}
		
		
	}
	}
	
