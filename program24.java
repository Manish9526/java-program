import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: Summation_Digit
// Discription:   Summation of Digit.
// Input:		  integer
// Output:		  Display.
// Author:		  Manish Ghalme
// Date:		  20/4/2021.
//
/////////////////////////////////////////////////
class Display_Summation
{
	public int Arr[];
	private int iSumDigit;
	
	public Display_Summation(int iNo)
	{
		Arr=new int[iNo];
		this.iSumDigit=0;
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		int iCnt=0;
		System.out.println("Enter the element of Array");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	
	public void Summation_Digit()
	{
		int iCnt=0,iDigit=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			int iNo=Arr[iCnt];
			iSumDigit=0;
			while(iNo!=0)
			{
				iDigit=iNo%10;
				iSumDigit=iSumDigit+iDigit;
				iNo=iNo/10;
			}
			System.out.print(" "+iSumDigit);
		}
	}
}
////////////////////////////////////////////////////////
// Accept N number from user and Display summation of 
//		digit of each number.
////////////////////////////////////////////////////////

class program24
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		Display_Summation dobj=new Display_Summation(iValue);
		dobj.Accept();
		dobj.Summation_Digit();
	}
}
////////////////////////////////////////////////////////////
// Input:  2 4 6 8 10 12 14.
// output: 14
////////////////////////////////////////////////////////////
