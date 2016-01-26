import java.util.ArrayList;

public class Spell
	{
		
		private String name;
		private int value;
		private String ability;
		int score1=0;
		int score2=0;
	
		
		public Spell (String n, int v, String a)
		{
			name=n;
			value=v;
			ability=a;
		}

		public String getName()
			{
				return name;
			}


		public void setName(String name)
			{
				this.name = name;
			}


		public int getValue()
			{
				return value;
			}


		public void setValue(int value)
			{
				this.value = value;
			}


		public String getAbility()
			{
				return ability;
			}


		public void setAbility(String ability)
			{
				this.ability = ability;
			}

		
		
	}


