/*
 * The following array contains attendance data of a student:
int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
Write a program to find the attendance percentage of this student
 */
package neebal_assignment_4;

public class question2 {

	public static void main(String[] args) {
		int arr[]={1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		int presentdays=0;
		int totaldays=arr.length;
		for(int i=0;i<totaldays;i++)
		{
			if(arr[i]==1)
			{
				presentdays++;
			}
		}
		double attendeceperce=(double)presentdays/totaldays*100;
		System.out.println("totaldays are: "+totaldays);
		System.out.println("presentdays are: "+presentdays);
		System.out.println("attendence percentage are: "+attendeceperce);

	}

}
