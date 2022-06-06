import java.lang.*;
import java.util.*;

//////////////////////////////////////////////////
//
// Function Name: Minimum
// Discription:   find the minimum number.
// Input:		  integer
// Output:		  integer
// Author:		  Manish Ghalme
// Date:		  20/4/2021.
//
/////////////////////////////////////////////////
class MinNumber
{
	private int iMin;
	public int Arr[];
	
	public MinNumber(int iNo)
	{
		Arr=new int [iNo];
		this.iMin=0;
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner (System.in);
		int iCnt=0;
		System.out.println("Enter the element of Array");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	
	public int Minimum()
	{
		int iCnt=0;
		iMin=Arr[iCnt];
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]<iMin)
			{
				iMin=Arr[iCnt];
			}
		}
		return iMin;
	}
}
/////////////////////////////////////////////////////////
// Accept N number from user and return smallest number.
////////////////////////////////////////////////////////
class program22
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		MinNumber mobj=new MinNumber(iValue);
		mobj.Accept();
		int iRet=mobj.Minimum();
		System.out.println("The smallest number is: "+iRet);
	}
}
////////////////////////////////////////////////////////////
// Input:  2 4 6 8 10 12 14.
// output: 2
////////////////////////////////////////////////////////////
