import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: ChkNumber
// Discription:   search number given Array.
// Input:		  integer.
// Output:		  boolean.
// Author:		  Manish Ghalme
// Date:		  16/4/2021.
//
/////////////////////////////////////////////////
class ChkNumber
{
	public int Arr[];
	public int iValue;
	
	public ChkNumber(int iNo1,int iNo2)
	{
		Arr=new int[iNo1];
		this.iValue=iNo2;
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
	
	public boolean Numberpre()
	{
		int iCnt=0;
		boolean flag=false;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(iValue==Arr[iCnt])
			{
				flag=true;
			}
		}
		return flag;
	}
}

///////////////////////////////////////////////////////
// Accept N number from user and accept one other number 
//		as no check whather NO is present of not 
//////////////////////////////////////////////////////

class program7
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int iSize=sobj.nextInt();
		
		System.out.println("Enter search number");
		int iNo=sobj.nextInt();
		
		ChkNumber cobj=new ChkNumber(iSize,iNo);
		cobj.Accept();
		boolean bRet=cobj.Numberpre();
		if(bRet==true)
		{
			System.out.println("Number is precent");
		}
		else
		{
			System.out.println("Number is Abcent");
		}
		
	}
}
///////////////////////////////////////
// Input:  85 66 3 80 93 88
// output: 53.
///////////////////////////////////////