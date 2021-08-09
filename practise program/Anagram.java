import java.util.Scanner;

class Anagram
{

	void check(String first,String second)//if length equal this method will run
	{
        String compare=first; // showing first value
		System.out.println("first value ="+ compare);    //cat
		String comparewith=second;//showing second value
		System.out.println("second value ="+ comparewith);   //tac
		int m=0;
		for(int i=0;i<compare.length();i++) //loop till first  word length (i.e cat  (length=3))
		{
		
			for(int j=0;j<compare.length();j++) //loop to check first's  letter of first  word equal to any letter of second word 
			{
					if((compare.charAt(i))!=(comparewith.charAt(j))) //if  not equal do nothing go on for further and check next index value
					{
						System.out.print("");
					}
					else 
					{
						m++; //whenever its get the same character m will increase
						//System.out.println("only "+m+" is common");
					}
			}			
		}
		//System.out.println(m);
		if(m == compare.length()) //if m (that is= getting same letter) is equal to length of that string
		{
		System.out.println("yes,they are anagram.");// then its anagram
		}
		else
		{
			System.out.println("not anagram.");	//otherwise not
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter first string");
		String first=s.nextLine();  //taking first word
		System.out.println("please enter second string");
		String second=s.nextLine();//taking second word
		Anagram a=new Anagram(); 
		if(first.length()==second.length()) //check first if length unequal or not
		{
			a.check(first,second);
		}
		else
		{
			System.out.println("both value are unequal in size  then obiviously it's not anagram");
	
		}
	}
}