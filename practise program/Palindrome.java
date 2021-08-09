//Some examples of palindromic words are redivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, madam, and refer,dad

import java.util.Scanner;

class Palindrome
{
   void check(String s)//palindrome method check
   {
	   
		String value=s;
		int k=value.length()-1; // 4
		for(int i=0;i<value.length()%2;i++)// level  //loop till haft of words's length
		{
			if(value.charAt(i) ==(value.charAt(k)))//if first letters same to last letter in reverse order
			{
				//System.out.println("same");
				k--;
			}
			else
			{
				break;
			}
			System.out.println("it's  palindrome");
		}
	}
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please pass the word");//getting word from user
		String word=s.nextLine();
		Palindrome p=new Palindrome();
		p.check(word);//pass the word to method to check
	}

}
