import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: PrintEven
// Discription:   Display the even Number.
// Input:		  integer
// Output:		  --
// Author:		  Manish Ghalme
// Date:		  16/4/2021.
//
/////////////////////////////////////////////////
class PrintEven
{
	private int iValue;
	
	public PrintEven(int iNo)
	{
		this.iValue=iNo;
	}
	
	public void Display()
	{
		int iCnt=0;
		for(iCnt=1;iCnt<=iValue;iCnt++)
		{
			System.out.println(iCnt*2);
		}
	}
}

///////////////////////////////////////////////////////
// Write a program which accept one number from user &print  
//         that number of even number on screen.
// Input:  7
// output: 2 4 6 8 10 12 14.
//////////////////////////////////////////////////////

class program2
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		PrintEven pobj=new PrintEven(iValue);
		pobj.Display();
		
	}
}