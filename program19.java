
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
class Display_Pattren
{
	public int iRow;
	public int iCol;
	
	public Display_Pattren(int iValue1,int iValue2)
	{
		this.iRow=iValue1;
		this.iCol=iValue2;
	}
	
	public void Pattern()
	{
		int i=0,j=0;
		
		if(iRow!=iCol)
		{
			return;
		}
		
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>=1;j--)
			{
				if((i==j)||(i==1)||(j==1)||(i==iRow)||(j==iCol))
				{
					System.out.print(" *");
				}
				else if(i>j)
				{
					System.out.print(" #");
				}
				else
				{
					System.out.print(" @");
				}
			}
			System.out.println();
		}
	}
}

/////////////////////////////////////////////////////////////////
// Accept number of row & colume from user & display below pattern 
/////////////////////////////////////////////////////////////////

class program19
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number of Row");
		int iNo1=sobj.nextInt();
		
		System.out.println("Enter the number of colume");
		int iNo2= sobj.nextInt();
		
		Display_Pattren dobj=new Display_Pattren(iNo1,iNo2);
		dobj.Pattern();
	
	}
}
///////////////////////////////////////
// Input:  row=6,col=6
// output: 
//			* * * * * *
//			* # # # * * 
//			* # # * @ *
//			* # * @ @ *        
//			* * @ @ @ *
//			* * * * * *
///////////////////////////////////////