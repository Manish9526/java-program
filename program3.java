import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: DisplayDigit
// Discription:   Reverse digit.
// Input:		  integer
// Output:		  --
// Author:		  Manish Ghalme
// Date:		  16/4/2021.
//
/////////////////////////////////////////////////
class DisplayDigit
{
	public int iNo;
	private int iDigit;
	
	public DisplayDigit(int iValue)
	{
		this.iNo=iValue;
		this.iDigit=0;
	}
	
	public void Display()
	{
		while(iNo!=0)
		{
			iDigit=iNo%10;
			System.out.println(iDigit);
			iNo=iNo/10;
		}
	}
}

///////////////////////////////////////////////////////
// Write a program which accept number from user &  
//         Display it digit in reverse order
//////////////////////////////////////////////////////

class program3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		DisplayDigit dobj=new DisplayDigit(iValue);
		dobj.Display();
	}
}
///////////////////////////////////////
// Input:  2395
// output: 5 9 3 2 .
///////////////////////////////////////