import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: DisplayEven
// Discription:   Diaply Even digit count.
// Input:		  integer
// Output:		  --
// Author:		  Manish Ghalme
// Date:		  16/4/2021.
//
/////////////////////////////////////////////////
class DisplayEven
{
	public int iNo;
	private int iDigit;
	private int iCnt;
	
	public DisplayEven(int iValue)
	{
		this.iNo=iValue;
		this.iDigit=0;
	}
	
	public int Display()
	{
		while(iNo!=0)
		{
			iDigit=iNo%10;
			if(iDigit%2==0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}

///////////////////////////////////////////////////////
// Write a program which accept number from user &  
//         return the count of even digit.
//////////////////////////////////////////////////////

class program4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		DisplayEven dobj=new DisplayEven(iValue);
		int iRet=dobj.Display();
		System.out.println(iRet);
	}
}
///////////////////////////////////////
// Input:  2395
// output: 1.
///////////////////////////////////////