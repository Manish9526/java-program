import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: DiffMaxMin
// Discription:   find Differance largest number and smallest number.
// Input:		  integer
// Output:		  integer
// Author:		  Manish Ghalme
// Date:		  20/4/2021.
//
/////////////////////////////////////////////////
class Differance
{
	private int iDiff;
	private int iMax;
	private int iMin;
	public int Arr[];
	
	public Differance(int iNo)
	{
		Arr=new int [iNo];
		this.iMax=0;
		this.iMin=0;
		this.iDiff=0;
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the element of Array");
		int iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	
	public int DiffMaxMin()
	{
		int iCnt=0;
		iMax=iMin=Arr[iCnt];
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]>iMax)
			{
				iMax=Arr[iCnt];
			}
			else if(Arr[iCnt]<iMin)
			{
				iMin=Arr[iCnt];
			}
		}
		iDiff=iMax-iMin;
		return iDiff;
	}
}
/////////////////////////////////////////////////////////
// Accept N number from user and return largest number.
////////////////////////////////////////////////////////

class program23
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int iValue=sobj.nextInt();
		
		Differance dobj=new Differance(iValue);
		dobj.Accept();
		int iRet=dobj.DiffMaxMin();
		System.out.println("The differance of largest and Smmalest is: "+iRet);
	}
}
////////////////////////////////////////////////////////////
// Input:   N :      6
//			element:85 66 3 66 93 88.
// output: 90(93-3);
////////////////////////////////////////////////////////////
