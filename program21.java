import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: Maximum
// Discription:   find the maximum number.
// Input:		  integer
// Output:		  integer
// Author:		  Manish Ghalme
// Date:		  20/4/2021.
//
/////////////////////////////////////////////////
class MaxNumber
{
	private int iMax;
	public int Arr[];
	
	public MaxNumber(int iNo)
	{
		Arr=new int[iNo];
		this.iMax=0;
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner (System.in);
		int iCnt=0;
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	}
	 public int Maximum()
	 {
		 int iCnt=0;
		 iMax=Arr[iCnt];
		 for(iCnt=0;iCnt<Arr.length;iCnt++)
		 {
			 if(Arr[iCnt]>iMax)
			 {
				 iMax=Arr[iCnt];
			 }
		 }
		 return iMax;
	 }
	
}

/////////////////////////////////////////////////////////
// Accept N number from user and return largest number.
////////////////////////////////////////////////////////

class program21
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int iSize=sobj.nextInt();
		
		MaxNumber mobj=new MaxNumber(iSize);
		mobj.Accept();
		int iRet=mobj.Maximum();
		System.out.println("The largest number is : "+iRet);
	}
}
////////////////////////////////////////////////////////////
// Input:  2 4 6 8 10 12 14.
// output: 14
////////////////////////////////////////////////////////////
