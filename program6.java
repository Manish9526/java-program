import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: Frequency_Even.
// Discription:   calculate count of even number.
// Input:		  integer.
// Output:		  integer.
// Author:		  Manish Ghalme
// Date:		  17/4/2021.
//
/////////////////////////////////////////////////
class FreqEvn
{
	public int Arr[];
	
	public FreqEvn(int iNo)
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
	
	public int Frequency_Even()
	{
		int iCnt=0,CountEvn=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			int iNo=Arr[iCnt];
			if(iNo%2==0)
			{
				CountEvn++;
			}
		}
		return CountEvn;
	}
}

///////////////////////////////////////////////////////
// Accept N number from user and return frequency
//  	of even elemet number.
//////////////////////////////////////////////////////

class program6
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int iSize=sobj.nextInt();
		FreqEvn fobj=new FreqEvn (iSize);
		fobj.Accept();
		int iRet=fobj.Frequency_Even();
		System.out.println("Summation diffrance of even and od number: "+iRet);
	}
}
///////////////////////////////////////
// Input:  85 66 3 80 93 88
// output: 3.
///////////////////////////////////////