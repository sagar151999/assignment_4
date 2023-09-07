/*
 * The following arrays shows the profits of a company from 2001 to 2010:
int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
Write a program to find which year the decline in profits began
 */
package neebal_assignment_4;

public class questions_6 {

	public static void main(String[] args) {
		int profitsyear[] = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
		int indexvalue=0;
		for(int i=1;i<profitsyear.length;i++) 
		{
			if(profitsyear[i-1]<profitsyear[i]) 
			{
				indexvalue=i+1;
			}
		}
		System.out.println("The decline in profit are : "+(2001+indexvalue));
	}

}
