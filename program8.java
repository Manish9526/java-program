import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: ThreeDigit
// Discription:   search three digit number.
// Input:		  integer.
// Output:		  --
// Author:		  Manish Ghalme
// Date:		  17/4/2021.
//
/////////////////////////////////////////////////
class ChkNumber
{
	public int Arr[];
	
	public ChkNumber(int iNo1)
	{
		Arr=new int[iNo1];
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		int iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	
	public void ThreeDigit()
	{
		int iCnt=0,iCntDigit=0,iDigit=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			int iNo=Arr[iCnt];
			iCntDigit=0;
			while(iNo!=0)
			{
				iCntDigit++;
				iNo=iNo/10;
			}
			if(iCntDigit==3)
			{
				System.out.println(Arr[iCnt]);
			}
		}
	}
}

///////////////////////////////////////////////////////
// Accept N number from user & Display three digit number. 
//////////////////////////////////////////////////////

class program8
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int iSize=sobj.nextInt();
		
		ChkNumber cobj=new ChkNumber(iSize);
		cobj.Accept();
		cobj.ThreeDigit();
		
	}
}
///////////////////////////////////////
// Input:  85 123 34 555 634 
// output: 123 555 634
///////////////////////////////////////