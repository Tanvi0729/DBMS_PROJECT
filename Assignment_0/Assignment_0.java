/* 	PANDIT DEENDAYAL ENERGY UNIVERSITY
	SUBJECT:DATABASE AND MANAGEMENT SYSTEM
	ASSIGNMENT-0-Perform any query using Java Language in given database.
	Team no: 27				Team Leader: Tanvi Modi(19BCP173D)
	
	In this assignment, we perform a query on table called Internet firewall data that has all the information
	about the which source and desinations are used for forwarding the data and many more.
	
	The query is about when the user enter the line number, user can see all the data from of the line number. 
				
*/
import java.io.*;
import java.util.*;
import java.util.Scanner;
 
public class Assignment_0
{

	public static void main(String[] args) throws Exception 
	{
		String text = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Line Number:");
		int lineNumber = sc.nextInt();
		int i;

    	try
		{
      		FileReader readfile = new FileReader("C:\\Users\\tanvi\\OneDrive\\Documents\\DBMS Project\\Internet firewall data.csv");
      		BufferedReader readbuffer = new BufferedReader(readfile);
      		for (i = 1; i <= 65533; i++) 
			{
        		if (i == lineNumber) 
				{
					text = readbuffer.readLine();
				
				}
			else
				readbuffer.readLine();
				
			}
			
    	}
		catch (Exception e) 
		{
      		System.out.println(e);
    	}
		System.out.println("\t");
		System.out.println("Source Port,Destination Port,NAT Source Port,NAT Destination Port,Action,Bytes,Bytes Sent,Bytes Received,Packets,Elapsed Time (sec),pkts_sent,pkts_received");
		System.out.println("\t");
		System.out.println(text);
		System.out.println("\t");

  	}
	 
}