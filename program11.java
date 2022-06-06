import java.lang.*;
import java.util.*;

/////////////////////////////////////////////////
//
// Function Name: Pattern
// Discription:   Display Pattern.
// Input:		  integer,integer
// Output:		  --
// Author:		  Manish Ghalme
// Date:		  18/4/2021.
//
/////////////////////////////////////////////////
class Display_Pattern
{
	public int iRow;
	public int iCol;
	
	public Display_Pattern(int iValue1,int iValue2)
	{
		this.iRow=iValue1;
		this.iCol=iValue2;
	}
	
	public void Pattern()
	{
		int i=0,j=0;
		char ch='\0';
		for(i=0;i<=iRow;i++)
		{
			for(j=0,ch='A';j<=iCol;j++,ch++)
			{
				System.out.print(" "+ch);
			}
			System.out.println();
		}
	}
}

/////////////////////////////////////////////////////////////////
// Accept number of row & colume from user & display below pattern 
/////////////////////////////////////////////////////////////////

class program11
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner (System.in);
		System.out.println("Enter the number of Row");
		int iNo1=sobj.nextInt();
		
		System.out.println("Enter the number of colume");
		int iNo2=sobj.nextInt();
		
		Display_Pattern dobj=new Display_Pattern(iNo1,iNo2);
		dobj.Pattern();
	
	}
}
///////////////////////////////////////
// Input:  row=4,col=4
// output: 
//			A B C D
//			A B C D
//			A B C D
//			A B C D
///////////////////////////////////////