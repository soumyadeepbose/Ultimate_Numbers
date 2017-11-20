/**
 * Made in India
 * Made by Soumyadeep Bose
 * Made with Java
 * Made for public
 * 
 * Program Name : Ultimate Number.java
 * Version : v1.1.1
 * 
 * Presented to : Biman Sir
 * Writer : Soumyadeep Bose
 * Date : 8/10/2017
 * 
 * Copyright (c), 2017. All rights reserved.
 * 	This program belongs to Soumyadeep Bose and is 
 * 	not to be copied without the prior permission of the 
 * 	writer and to whom it belongs.
 */

import java.io.*;
import java.util.*;
public class Ultimate_Numbers 
{
	public static boolean checkPrime(int n)//function to check prime numbers
	{
		int c=0;
		for(int z=1;z<=n;z++)
		{
			if(n%z==0)
				c++;
		}
		if(c==2)
			return true;
		else
			return false;
	}
	
	public static boolean checkPerfect(int n)//function to check prime numbers
	{
		int s=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				s=s+i;
		}
		if(s==n)
			return true;
		else
			return false;
	}
	
	public static boolean checkPalindrome(int n)//function to check palindrome numbers
	{
		int d,rn=0;
		int n1=n;
		while(n>0)
		{
			d = n%10;
			rn = (rn*10)+d;
			n/=10;
		}
		if(rn==n1)
			return true;
		else
			return false;
	}
	
	public static boolean checkArmstrong(int n)//function to check Armstrong numbers
	{
		int s=0,d;
		int n1=n;
		while(n>0)
		{
			d = n%10;
			s = s+(d*d*d);
			n/=10;
		}
		if(s==n1)
			return true;
		else
			return false;
	}
	
	public static boolean checkSpecial(int n)//function to check special numbers
	{
		int s=0,d,f=1;
		int n1=n;
		while(n>0)
		{
			d=n%10;
			for(int i=1;i<=d;i++)
				f=f*i;
			s = s+f;
			n/=10;
			f=1;
		}
		if(s==n1)
			return true;
		else
			return false;
	}
	
	public static boolean checkPalPrime(int n)//function to check pal-prime numbers or not
	{
		int rn=0,z,d,c=0;
		int n1=n;
		while(n>0)
		{
			d=n%10;
			rn = (rn*10)+d;
			n/=10;
		}
		for(z=1;z<=n1;z++)
		{
			if(n1%z==0)
				c++;
		}
		if(rn==n1 && c==2)
			return true;
		else
			return false;
	}
	
	public static boolean checkUniqueness(int n)//function to check uniqueness of a number
	{
		int n1,d,i,c=0;
        n1=n;
        for(i=0;i<=9;i++)
        {
            n=n1;
            while(n>0)
            {
                d=n%10;
                if(d==i)
                    c++;
                n/=10;
            }
            if(c>1)
                break;
            c=0;
        }
        if(c>1)
			return false;
		else
			return true;
	}
	
	public static boolean checkMagic(int n)//function to check magic numbers
	{
		int s=0,d;
		while(n>9)
		{
			while(n>0)
			{
				d = n%10;
				s = s+d;
				n/=10;
			}
			n=s;
			if(n==1)
				break;
			s=0;
		}
		if(n==1)
			return true;
		else
			return false;
	}
	
	public static boolean checkHappiness(int n)//function to check happy numbers
	{
		int s=0,d;
		while(n>9)
		{
			while(n>0)
			{
				d = n%10;
				s = s+(d*d);
				n/=10;
			}
			n=s;
			if(n==1)
				break;
			s=0;
		}
		if(n==1)
			return true;
		else
			return false;
	}
	
	public static boolean checkNeon(int n)//function to check Neon numbers
	{
		int s=0,d;
		int n1=n;
		int sq=n*n;
		while(sq>0)
		{
			d=sq%10;
			s = s+d;
			sq/=10;
		}
		if(s==n1)
			return true;
		else
			return false;
	}
	
	public static boolean checkAutomorphic(int n)//function to check Automorphic(Circular) numbers
	{
		int c=0,sq,nn;
		int n1=n;
		while(n>0)
		{
			c++;
			n/=10;
		}
		sq = n1*n1;
		nn = sq%(int)Math.pow(10,c);
		if(nn==n1)
			return true;
		else
			return false;
	}
	
	public static boolean checkSpy(int n)//function to check Spy numbers
	{
		int s=0,p=1,d;
		while(n>0)
		{
			d=n%10;
			s=s+d;
			p=p*d;
			n/=10;
		}
		if(s==p)
			return true;
		else
			return false;
	}
	
	public static boolean checkKaprekar(int n)//function to check Kaprekar numbers
	{
		int c=0,pofe=0,l2ds,sofe=0,f2ds,pofo=0,pofot=0,sofo=0;
		int n1=n;
		int sq=n1*n1;
		while(sq>0)
		{
			c++;
			sq/=10;
		}
		sq=n1*n1;
		if(c%2==0)
		{
			pofe=(int)c/2;
			l2ds=(sq%(int)Math.pow(10, pofe));
			f2ds=(sq/(int)Math.pow(10, pofe));
			sofe=f2ds+l2ds;
			if(sofe==n)
				return true;
			else
				return false;
		}
		else
		{
			pofo=(int)c/2;
			pofot=pofo+1;
			l2ds=(sq%(int)Math.pow(10, pofot));
			f2ds=(sq/(int)Math.pow(10, pofot));
			sofo=f2ds+l2ds;
			if(sofo==n)
				return true;
			else
				return false;
		}
	}
	
	public static void main(String[] args) throws IOException,InputMismatchException
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int ch,ran,men,i,str=1;
			String user_name="";
			System.out.println("Please enter your name : ");
			user_name = sc.nextLine();
			System.out.println("Welcome "+user_name+"! \n The Menu is below. Please enter your choice according to your operations.");
			System.out.println("\n\t MENU :");
			System.out.println("\t\t 1. : To check the Famous nos. listed till the given range.");
			System.out.println("\t\t 2. : To check whether the no. you will enter is any of the Famous nos. or not.");
			System.out.println("\t\t\t\t SO LETS BEGIN!");
			System.out.println("\nNow please enter your choice carefully : ");
			ch = sc.nextInt();
			switch (ch)
			{
			case 1 : System.out.println("Now please enter the range (the number till which you want all the famous number's list) : ");
					ran = sc.nextInt();
					System.out.println("Do you want to enter a starting number from which we will start counting(default value otherwise is 1) ?");
					System.out.println("If Yes then press 5 else press 55. Please enter carefully : ");
					int p = sc.nextInt();
					if(p==5)
					{
						System.out.println("You have entered Yes. Okay then enter the starting number here : ");
						str = sc.nextInt();
						while(str>ran)
						{
							if(str>ran)
							{
								System.err.println("The starting number cannot be greater than the range or the ending number. \nIf you again enter a starting number greater than range then no number's list will be displayed. \nSo please enter a number which is smaller than range : ");
								str=sc.nextInt();
								if(str<ran)
									break;
							}
						}
					}
					else if(p==55)
					{
						System.out.println("You have entered No.");
						str=1;
					}
					else
						System.out.println("I am telling you again. If Yes then press 5 else press 55. Please, please, please do it carefully.");
					System.out.println("Below are the famous number's list from "+str+" till "+ran+" .");
					System.out.println("Now tell us which famous number's list you want to see. Again the menu is below. Please enter fast because I am eagerly waiting to serve you. ");
					System.out.println("\t MENU :");
					System.out.println("\t\t 1. : Prime numbers");
					System.out.println("\t\t 2. : Perfect numbers");
					System.out.println("\t\t 3. : Palindrome numbers");
					System.out.println("\t\t 4. : Armstrong numbers");
					System.out.println("\t\t 5. : Special numbers");
					System.out.println("\t\t 6. : Pal-Prime numbers");
					System.out.println("\t\t 7. : Unique numbers");
					System.out.println("\t\t 8. : Magical numbers");
					System.out.println("\t\t 9. : Happy numbers");
					System.out.println("\t\t 10. : Neon numbers");
					System.out.println("\t\t 11. : Automorphic/Circular numbers");
					System.out.println("\t\t 12. : Spy numbers");
					System.out.println("\t\t 13. : Kaprekar numbers");
					System.out.println("\t\t 14. : Each and every numbers with their names!");
					System.out.println("Again enter your choice corresponding to the menu above : ");
					men = sc.nextInt();
					switch (men)
					{
					case 1 : System.out.println("Below are the Prime numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkPrime(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 2 : System.out.println("Below are the Perfect numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkPerfect(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 3 : System.out.println("Below are the Palindrome numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkPalindrome(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 4 : System.out.println("Below are the Armstrong numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkArmstrong(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 5 : System.out.println("Below are the Special numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkSpecial(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 6 : System.out.println("Below are the Palindrome-Prime numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkPalPrime(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 7 : System.out.println("Below are the Unique numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkUniqueness(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 8 : System.out.println("Below are the Magical numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkMagic(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 9 : System.out.println("Below are the Happy numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkHappiness(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 10 : System.out.println("Below are the Neon numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkNeon(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 11 : System.out.println("Below are the Automorphic(Circular) numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkAutomorphic(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 12 : System.out.println("Below are the Spy numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkSpy(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 13 : System.out.println("Below are the Kaprekar numbers from "+str+" to "+ran+" .");
							for(i=str;i<=ran;i++)
							{
								if(checkKaprekar(i)==true)
									System.out.print(i+", ");
							}
					break;
					case 14 : System.out.println("Below are the list of all famous numbers(alongwith their names) from 0 to "+ran+" .");
							System.out.print("\n");
							for(i=str;i<=ran;i++)
							{
								if(checkPrime(i)==true)
									System.out.println("\t"+i+" is a Prime number.");
								if(checkPerfect(i)==true)
									System.out.println("\t"+i+" is a Perfect number.");
								if(checkPalindrome(i)==true)
									System.out.println("\t"+i+" is a Palindrome number.");
								if(checkArmstrong(i)==true)
									System.out.println("\t"+i+" is a Armstrong number.");
								if(checkSpecial(i)==true)
									System.out.println("\t"+i+" is very Special.");
								if(checkPalPrime(i)==true)
									System.out.println("\t"+i+" is a Pal-Prime number.");
								if(checkUniqueness(i)==true)
									System.out.println("\t"+i+" is very Unique. Keep it in a safe place otherwise it might be stolen.");
								if(checkMagic(i)==true)
									System.out.println("\t"+i+" is Magical.");
								if(checkHappiness(i)==true)
									System.out.println("\t"+i+" is a Happy number.");
								if(checkNeon(i)==true)
									System.out.println("\t"+i+" is a Neon number.");
								if(checkAutomorphic(i)==true)
									System.out.println("\t"+i+" is a Automorphic number.");
								if(checkSpy(i)==true)
									System.out.println("\t"+i+" is a good Spy. Beware!");
								if(checkKaprekar(i)==true)
									System.out.println("\t"+i+" is a Kaprekar number.");
								System.out.print("\n");
							}
					break;
					default : System.err.println("Please look into your choices again. The choice number you've entered is absolutely an INVALID CHOICE! Please try again! :-)");
					break;
					}
				break;
			case 2 : int num;
					System.out.println("Please enter the number here : ");
					num = sc.nextInt();
					if(checkPrime(num)==true)
						System.out.println("\t"+num+" is a Prime number.");
					if(checkPerfect(num)==true)
						System.out.println("\t"+num+" is a Perfect number.");
					if(checkPalindrome(num)==true)
						System.out.println("\t"+num+" is a Palindrome number.");
					if(checkArmstrong(num)==true)
						System.out.println("\t"+num+" is a Armstrong number.");
					if(checkSpecial(num)==true)
						System.out.println("\t"+num+" is very Special.");
					if(checkPalPrime(num)==true)
						System.out.println("\t"+num+" is a Pal-Prime number.");
					if(checkUniqueness(num)==true)
						System.out.println("\t"+num+" is very Unique. Keep it in a safe place otherwise it might be stolen.");
					if(checkMagic(num)==true)
						System.out.println("\t"+num+" is Magical.");
					if(checkHappiness(num)==true)
						System.out.println("\t"+num+" is a Happy number.");
					if(checkNeon(num)==true)
						System.out.println("\t"+num+" is a Neon number.");
					if(checkAutomorphic(num)==true)
						System.out.println("\t"+num+" is a Automorphic number.");
					if(checkSpy(num)==true)
						System.out.println("\t"+num+" is a good Spy. Beware!");
					if(checkKaprekar(num)==true)
						System.out.println("\t"+num+" is a Kaprekar number.");
			break;
			default : System.out.println("Please look into your choices again. The choice number you've entered is absolutely an INVALID CHOICE! Please try again! :-)");
			break;
			}
			System.out.println("\n\nThank you very very very much for using this program. \nI am grateful to serve you. \nIf you have any new type of number then please send an e-mail to bosemanabi@123gmail.com. \nThe e-mail should contain the DEFINITION AND AN EXAMPLE of the new type of number. \nI will surely try to implement the new type of number in this program. \nAnyway, thanks a lot. If you have liked this program then please rate it out of 5. \nGive your rating here (this rating would not be send to any other resources) : ");
			int r = sc.nextInt();
			switch(r)
			{
			case 1 : System.out.println("Thanks for your feedback!  I will surely improve in the next version. I promise you. :-(");
			break;
			case 2 : System.out.println("Thanks for your feedback! I will try to improve in the next version. I promise you. :-|");
			break;
			case 3 : System.out.println("Thanks for your feedback! I am glad. :-|");
			break;
			case 4 : System.out.println("Thanks for your feedback! I am very happy. :-)");
			break;
			case 5 : System.out.println("Thanks for your feedback! I am very very happy. :-)");
			break;
			default : System.out.println("What type of rating is this? Please enter 1/2/3/4/5 .");
			}
			sc.close();
		}
		catch(NumberFormatException ex)
		{
			System.err.println("\nPlease, please, please enter a number only.\nDo not enter anything else.");
		}
		catch(ArithmeticException ex)
		{
			System.err.println("\nPlease, please, please enter a divisor other than 0.");
		}
		catch(InputMismatchException ex)
		{
			System.err.println("\nPlease enter the correct type of character where required.");
		}
	}
}
