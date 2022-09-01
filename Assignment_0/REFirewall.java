import java.io.*;  
import java.util.Scanner;  
public class   REFirewall
{  
public static void main(String[] args) throws Exception  
{  
//parsing a CSV file into Scanner class constructor  
Scanner sc = new Scanner(new File("C:\\Users\\tanvi\\OneDrive\\Documents\\DBMS Project\\Internet firewall data.csv"));  
sc.useDelimiter(","); 
//sets the delimiter pattern  
while (sc.hasNext())  //returns a boolean value  
{  
System.out.print(sc.next()); 
System.out.print("\t");
//find and returns the next complete token from this scanner  
}   
sc.close();  //closes the scanner  
}  
}