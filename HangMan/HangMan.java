class HangMan
{
	static String [][]Guess_The_Color =new String[2][10];
	static String [][]Guess_The_City =new String[2][10];
	static void data()
	{
		
		Guess_The_Color[0][0]="O-R-A-N-G-E";
		Guess_The_Color[1][0]="_-_-_-_-_-_";
		
		Guess_The_Color[0][1]="Y-E-L-L-O-W";
		Guess_The_Color[1][1]="_-_-_-_-_-_";
		
		Guess_The_Color[0][2]="B-L-U-E";
		Guess_The_Color[1][2]="_-_-_-_";
		
		Guess_The_Color[0][3]="B-R-O-W-N";
		Guess_The_Color[1][3]="_-_-_-_-_";
		
		Guess_The_Color[0][4]="S-A-F-R-O-N";
		Guess_The_Color[1][4]="_-_-_-_-_-_";
		
		Guess_The_Color[0][5]="O-L-I-V-E";
		Guess_The_Color[1][5]="_-_-_-_-_";
		
		Guess_The_Color[0][6]="P-U-R-P-L-E";
		Guess_The_Color[1][6]="_-_-_-_-_-_";
		
		Guess_The_Color[0][7]="G-R-E-E-N";
		Guess_The_Color[1][7]="_-_-_-_-_";
		
		Guess_The_Color[0][8]="M-A-R-O-O-N";
		Guess_The_Color[1][8]="_-_-_-_-_-_";
		
		
		Guess_The_Color[0][9]="M-A-G-E-N-T-A";
		Guess_The_Color[1][9]="_-_-_-_-_-_-_";
		
		
		Guess_The_City[0][0]="D-E-L-H-I";
		Guess_The_City[1][0]="_-_-_-_-_";
		
		Guess_The_City[0][1]="K-O-L-K-A-T-A";
		Guess_The_City[1][1]="_-_-_-_-_-_-_";
		
		Guess_The_City[0][2]="B-A-N-G-A-L-O-R-E";
		Guess_The_City[1][2]="_-_-_-_-_-_-_-_-_";
		
		Guess_The_City[0][3]="C-O-I-M-B-A-T-O-R-E";
		Guess_The_City[1][3]="_-_-_-_-_-_-_-_-_-_";
		
		Guess_The_City[0][4]="N-A-G-P-U-R";
		Guess_The_City[1][4]="_-_-_-_-_-_";
		
		Guess_The_City[0][5]="J-A-L-A-N-D-H-A-R";
		Guess_The_City[1][5]="_-_-_-_-_-_-_-_-_";
		
		Guess_The_City[0][6]="P-U-R-P-L-E";
		Guess_The_City[1][6]="_-_-_-_-_-_";
		
		Guess_The_City[0][7]="A-M-R-I-T-S-A-R";
		Guess_The_City[1][7]="_-_-_-_-_-_-_-_";
		
		Guess_The_City[0][8]="V-R-I-N-D-A-V-A-N";
		Guess_The_City[1][8]="_-_-_-_-_-_-_-_-_";
		
		
		Guess_The_City[0][9]="H-Y-D-E-R-A-B-A-D";
		Guess_The_City[1][9]="_-_-_-_-_-_-_-_-_";
		
		
	}
	
	
	public static void main(String...arfgs)throws java.io.IOException
	{

		pn("\t\tEnter your name:");
		String name=sc.readLine();
		p();
		p("\t\t\tWelcome "+name+" to play Hang-Man ");
			
		
		while(true)
		{
		
		game(name);
		p();
		p("\t\t want to play again ? ");
		p("\t\t press 1 to play again:");
		p("\t\t press 0 to EXIT :");
		pn("\t\t:");
		char n;
		String am=sc.readLine().trim();
		if(am.equals(""))
			continue;
		else
		n=am.charAt(0);
		
		
		if(n=='0')
			break;
		}
		
	}
	static java.io.BufferedReader sc=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
	
	static void game(String name)
	{
		
		
		String question;
		String used=" ";
		String guess;
		String answer;
			
		
		try{
			data();
			int y=(int)Math.round(Math.random()*5+1);
			int x=(int)Math.round(Math.random()*8+1);
			// p(" x :"+x);
			if(y<=3)
			{
		question="your question is :GUESS THE COLOR ??";
		guess=Guess_The_Color[1][x];
		answer=Guess_The_Color[0][x];
				p();
				p("\tYOUR GUESS\t"+guess);
				p();
			
			}
			else
			{
			
		question="your question is :GUESS THE CITY ??";
		guess=Guess_The_City[1][x];
		answer=Guess_The_City[0][x];
				p();
				p("\tYOUR GUESS\t"+guess);
				p();
			
				
			}
		int i=0;
		while(true)
		{
		p(question);
			pn("Enter a character:");
			String pk=sc.readLine().trim();
			if(pk.equals(""))
				continue;
			
			char ch=pk.toUpperCase().charAt(0);
		
		if('0'==ch)
				 {
					javax.swing.JOptionPane.showMessageDialog(null,"ARE YOU SURE TO EXIT");
					break;
				 }
			if(-1!=answer.indexOf(ch))
			{

				for(int j=0;j<answer.length();j+=2)
				{
					if(ch==answer.charAt(j))
					{
						String g1=guess.substring(0,j);
						String g2=guess.substring(j+1,guess.length());
						guess=g1+ch+g2;
					}						
					else
					{
						
					}
					
				}
				
				show(i);
				p();
				p("\t\tLetter "+ch+" is found");
				p();
				p("\tYOUR GUESS\t"+guess);
				p();
				p("\tused characters\t"+used);
				
			if(guess.equals(answer))
			{
				javax.swing.JOptionPane.showMessageDialog(null,"YOU WIN "+name+" answer is :"+answer);
				break;
			}				
			}
			else
			{
			if((-1)==(used.indexOf(ch)))
				{
					used+=" "+ch;
				show(++i);
				}
				else
				show(i);
			if(i==7)
			{
				javax.swing.JOptionPane.showMessageDialog(null," YOU LOST "+name+" answer is \n "+answer);
				break;
			}
			
			p();
			p(question);
			p();
				p("\t\tletter "+ch+" is NOT found");
			p();
			p("\tYOUR GUESS\t"+guess);
			p();
			p("\tused characters\t"+used);
		
			}
			p("___________________________________________________________");
			p("___________________________________________________________");
			p();
		}
		}
		catch(java.io.IOException e)
		{
		}
	}
	
	static void show(int n)
	{
		
		
		switch(n)
		{
			
		
		case 0:	p("\t|--------");
		try{
			Thread.sleep(50);
				p("\t|       |");
				Thread.sleep(50);
				p("\t|       ");
				Thread.sleep(50);
				p("\t|       ");
				Thread.sleep(50);
				p("\t|       ");
				Thread.sleep(50);
				p("\t|         \t chances left:7");
				break;
		}
		catch(InterruptedException e)
		{
		}
		
		
		case 1:	p("\t|--------");
				p("\t|       |");
			try{
				Thread.sleep(10);
			
				p("\t|       |");
				Thread.sleep(10);
				p("\t|       O\t chances left:6");
				Thread.sleep(40);
				p("\t|      ");
				Thread.sleep(40);
				p("\t|     ");
				Thread.sleep(40);
				p("\t|    ");
				Thread.sleep(40);
				p("\t|^^^^^^^^^^^^^^");
				break;
			}
			catch(InterruptedException e)
			{
			}
		
		
		
		case 2:	p("\t|--------");
				p("\t|       |");
			try{
				Thread.sleep(10);
				p("\t|       |");
				Thread.sleep(10);
				pn("\t|     ");
				Thread.sleep(10);
				pn("\\");
				Thread.sleep(10);
				pn("_");
				Thread.sleep(10);
				p("O\t chances left:5");
				Thread.sleep(50);
				p("\t|      ");
				Thread.sleep(50);
				p("\t|     ");
				Thread.sleep(50);
				p("\t|    ");
				Thread.sleep(50);
				p("\t|^^^^^^^^^^^^^^");
				break;
			}
			catch(InterruptedException e)
			{
			}
		
		case 3:	p("\t|--------");
		try{
			Thread.sleep(80);
				p("\t|       |");
			Thread.sleep(70);
				
				p("\t|       |");
			Thread.sleep(70);
				pn("\t|     \\");
			Thread.sleep(10);
				pn("_");
			Thread.sleep(10);
				pn("O");
			Thread.sleep(10);
				pn("_");
			Thread.sleep(10);
				p("/\t ");
			Thread.sleep(40);
				p("\t|      ");
			Thread.sleep(40);
				p("\t|     ");
			Thread.sleep(40);
				p("\t|          \t chances left:4");
			Thread.sleep(40);
				p("\t|^^^^^^^^^^^^^^");
				break;
		}
		catch(InterruptedException e)
		{
		}
		
		
		
		
		case 4:	p("\t|--------");
		try{
			Thread.sleep(50);
				p("\t|       |");
			Thread.sleep(50);
				p("\t|       |");
			Thread.sleep(50);
				pn("\t|");
			Thread.sleep(50);
				pn("     \\");
			Thread.sleep(50);
				pn("_");
			Thread.sleep(50);
				pn("O");
			Thread.sleep(50);
				pn("_");
			Thread.sleep(50);
				p("/");
			Thread.sleep(50);
				pn("\t|       ");
			Thread.sleep(50);
				pn("\\");
			Thread.sleep(50);
				p("\\");
			Thread.sleep(50);
				p("\t|      ");
			Thread.sleep(50);
				p("\t|     ");
			Thread.sleep(50);
				p("\t|          \t chances left:3");
			Thread.sleep(50);
				p("\t|^^^^^^^^^^^^^^");
				break;
				
		}
		catch(InterruptedException e)
		{
		}
		
		
		case 5:	p("\t|--------");
		try{
			Thread.sleep(50);
				p("\t|       |");
			Thread.sleep(50);
				p("\t|       |");
			Thread.sleep(50);
				
				pn("\t|     ");
			Thread.sleep(50);
				pn("\\");
			Thread.sleep(50);
				pn("_");
			Thread.sleep(50);
				pn("O");
			Thread.sleep(50);
				pn("_");
			Thread.sleep(50);
				p("/");
			Thread.sleep(50);
				
				pn("\t|       ");
			Thread.sleep(50);
				pn("\\");
			Thread.sleep(50);
				p("\\");
			Thread.sleep(50);
				pn("\t|       ");
			Thread.sleep(50);
				p("/");
			Thread.sleep(50);
				
				p("\t|     ");
			Thread.sleep(50);
				
				p("\t|          \t chances left:2");
			Thread.sleep(50);
				p("\t|^^^^^^^^^^^^^^");
				break;
		}
		catch(InterruptedException e)
		{
		}

		
		
		case 6:	p("\t|--------");
		try{
			Thread.sleep(50);
				p("\t|       |");
			Thread.sleep(50);
				p("\t|       |");
			Thread.sleep(50);
			
			
				pn("\t|     ");
			Thread.sleep(50);
				pn("\\");
			Thread.sleep(50);
				pn("_");
			Thread.sleep(50);
				pn("O");
			Thread.sleep(50);
				pn("_");
			Thread.sleep(50);
				p("/");
		
			Thread.sleep(50);
				pn("\t|       ");
			Thread.sleep(50);
				pn("\\");
			Thread.sleep(50);
				p("\\");
			Thread.sleep(50);
				
				pn("\t|       ");
			Thread.sleep(50);
				pn("/ ");
			Thread.sleep(50);
				p("\\");
			Thread.sleep(50);
				p("\t| --------------    ");
			Thread.sleep(50);
				p("\t|          \t chances left:1");
			Thread.sleep(50);
				
				p("\t|^^^^^^^^^^^^^^");
				break;
				
		}
		catch(InterruptedException e)
		{
		}
		
		case 7:	p("\t|--------");
		try
		{
			Thread.sleep(40);
		
				p("\t|       |");
			Thread.sleep(40);
				p("\t|       |");
			Thread.sleep(40);
				p("\t|       O  \t");
			Thread.sleep(40);
				p("\t|");
			Thread.sleep(40);
				p("\t|     ");
			Thread.sleep(40);
				pn("\t|      ");
			Thread.sleep(10);
				pn("___");
			Thread.sleep(40);
				p("  \t Game Over you are dead#############");
			Thread.sleep(40);
				pn("\t|     ");
			Thread.sleep(40);
				pn("/");
			Thread.sleep(40);
				pn("|");
			Thread.sleep(40);
				pn("_");
			Thread.sleep(40);
				pn("|");
			Thread.sleep(40);
				p("\\");
			Thread.sleep(40);
				pn("\t|      ");
			Thread.sleep(40);
				pn("/");
			Thread.sleep(40);
				p(" \\  ");
			Thread.sleep(40);
				pn("\t|");
			for(int i=0;i<15;i++)
			{
			Thread.sleep(30);
				pn("^");
			}
				p("^");
			break;
		}
		catch(Exception e)
		{
		}
		
		}
	}
	
	
	
	static void p(Object o)
	{
		java.io.PrintStream out=new java.io.PrintStream(System.out);
		out.println(o);
	}
	static void p()
	{
		java.io.PrintStream out=new java.io.PrintStream(System.out);
		out.println();
	}
	static void pn(Object o)
	{
		java.io.PrintStream out=new java.io.PrintStream(System.out);
		out.print(o);
	}
	
}