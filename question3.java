/*
Store the following monthly sales report of a product in an array:
January 125,000 July 105,000
February 93,000 August 120,000
March 80,000 September 90,000
April 75,000 October 115,000
May 84,000 November 123,000
June 110,000 December 150,000
Write a program to store the quarterly sales report in another array and display the 
monthly, quarterly and total sales. (Note: January, February, March and April form the first 
quarter)
 */

package neebal_assignment_4;

public class question3 {

	public static void main(String[] args) {
		String month[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int salesam[]= {125000,93000,80000,75000,84000,110000,105000,120000,90000,115000,123000,150000};
		int salevalue=0;
		int n1=0;
		int n2=0;
		int n3=0;
		for(int i=0;i<salesam.length;i++) 
		{
		System.out.println(month[i]+" : "+salesam[i]);
		salevalue=salevalue+salesam[i];
		if(i<4) 
		{
		n1=n1+salesam[i];
		if(i==3) 
	    {
		System.out.println("The 1st quarterly sale value is : "+n1);
		}
		}
		else if(i>=4&&i<=7) 
			{
				n2=n2+salesam[i];
				if(i==7)
				{
					System.out.println("The 2nd quarterly sale value is : "+n2);
				}
			}
		else 
			{
				n3=n3+salesam[i];
			}
		}
		System.out.println("The 3rd quarterly sale value is : "+n3);
		System.out.println("The totalsales value is : "+salevalue);
}
}