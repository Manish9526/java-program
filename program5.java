import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: SumEven
// Discription:   perform the differace summation of even
//					and summation of odd number.
// Input:		  integer.
// Output:		  integer.
// Author:		  Manish Ghalme
// Date:		  16/4/2021.
//
/////////////////////////////////////////////////
class Summation
{
	public int Arr[];
	
	public Summation(int iNo)
	{
		this.Arr=new int[iNo];
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the element of Array");
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	
	public int SumEven()
	{
		int iSumEven=0,iSumodd=0;
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			int iNo=Arr[iCnt];
			if(iNo%2==0)
			{
				iSumEven=iSumEven+iNo;
			}
			else
			{
				iSumodd=iSumodd+iNo;
			}
		}
		return (iSumEven-iSumodd);
	}
}

///////////////////////////////////////////////////////
// Accept N number from user and & diffirace betn summation
//  	of even elemet and summation of odd elemets 
//////////////////////////////////////////////////////

class program5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int iSize=sobj.nextInt();
		Summation su=new Summation(iSize);
		su.Accept();
		int iRet=su.SumEven();
		System.out.println("Summation diffrance of even and od number: "+iRet);
	}
}
///////////////////////////////////////
// Input:  85 66 3 80 93 88
// output: 53.
///////////////////////////////////////