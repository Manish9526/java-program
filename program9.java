import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: Pattern
// Discription:   Display alphabet.
// Input:		  integer.
// Output:		  --
// Author:		  Manish Ghalme
// Date:		  17/4/2021.
//
/////////////////////////////////////////////////
class Display_Pattern
{
	public int iValue;
	
	public Display_Pattern(int iNo)
	{
		this.iValue=iNo;
	}
	
	public void Pattern()
	{
		char ch='\0';
		int iCnt=0;
		for(iCnt=1,ch='A';iCnt<=iValue;iCnt++,ch++)
		{
			System.out.print(" "+ch);
		}
	}
}

///////////////////////////////////////////////////////
// Accept number from user & display below pattern 
//////////////////////////////////////////////////////

class program9
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner (System.in);
		System.out.println("Enter the number");
		int iNo=sobj.nextInt();
		Display_Pattern dobj=new Display_Pattern(iNo);
		dobj.Pattern();
	
	}
}
///////////////////////////////////////
// Input:  5
// output: A B C D E 
///////////////////////////////////////