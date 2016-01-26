import java.util.ArrayList;
import java.util.Collections;
public class Book
{
	static ArrayList<Spell>book= new ArrayList<Spell>();
	public static void fillBook()
	{
		book.add(new Spell("Accio,", 31, " Summon an object"));
		book.add(new Spell("Alohomora, ",11 , "Open locked objects"));
		book.add(new Spell("Colloportus, ", 10, "Lock doors"));
		book.add(new Spell("Diffindio,", 18, "Split seams"));
		book.add(new Spell("Episkey, ", 30, "Heal small wounds"));
		book.add(new Spell("Finite Incantatum, ", 80, "Stop a spell being cast"));
		book.add(new Spell("Flagrate,", 21, "Allow user to write on objects"));
		book.add(new Spell("Geminio,", 20, "Duplicate an object"));
		book.add(new Spell("Liberacorpus,", 87, "Counter a Spell"));
		book.add(new Spell("Lumos, ",37 , "Create a light at the tip of wand"));
		book.add(new Spell("Quietus, ", 35 , "Quiet opponent"));
		book.add(new Spell("Rennervate, ", 75 , "Cure unconsciousness"));
		book.add(new Spell("Reparo,", 60, "Repair things"));
		book.add(new Spell("Tergeo,", 40, "Clean up messes"));
		book.add(new Spell("Rictusempra, ", 90, "Tickle apponent"));
		book.add(new Spell("Wingardium Leviosa, ",94 , "Make an object fly"));
		book.add(new Spell("Felix Felicis,", 95," create Liquid Luck"));
		book.add(new Spell("Amortentia,", 100, "create a Love potion"));
	}
	public static void pickSpell()
	{
		fillBook();
		Collections.shuffle(book);
	}
	public static void listBook()
		{
			for(Spell b: book)
				{
					System.out.println(b.getName());
				}
			 
		}
}