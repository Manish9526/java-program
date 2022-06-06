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
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1,ch='a';j<=iCol;j++,ch++)
			{
				if((i%2)!=0)
				{
					System.out.print(" "+ch);
				}
				else
				{
					System.out.print(" "+j);
				}
			}
			System.out.println();
		}
	}
}

/////////////////////////////////////////////////////////////////
// Accept number of row & colume from user & display below pattern 
/////////////////////////////////////////////////////////////////

class program13
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
//			a b c d e
//			1 2 3 4 5
//			a b c d e
//			1 2 3 4 5
//			a b c d e
///////////////////////////////////////