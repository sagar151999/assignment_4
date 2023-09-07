/*
 * The following even sized array shows on and off times of an electric vehicle on a 
particular day in 24 hour format: (850 means 8:50AM, 1330 means 1:30PM)
int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
Calculate the running time of the electric vehicle. Expected output: 1 hr 50 min
 */

package neebal_assignment_4;

public class question4 {

	public static void main(String[] args) 
	{
		int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
		int totalruningtime=0;
		for(int i=0;i<ev.length;i+=2)
		{
			int starttime=ev[i];
			int endtime=ev[i+1];
			int starthour=starttime/100;
			int startminute=starttime%100;
			int endhour=endtime/100;
			int endminute=endtime%100;
			int runningtimeminute=(endhour*60+endminute)-(starthour*60+startminute);
			totalruningtime+=runningtimeminute;
		}
		int hours=totalruningtime/60;
		int minute=totalruningtime%60;
		System.out.println("electric vehicle runinig time: "+hours+" hr "+minute+" min");
	}

}
