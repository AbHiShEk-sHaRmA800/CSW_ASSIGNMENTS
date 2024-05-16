
import java.io.*;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the File Name:");
		String fo=obj.nextLine();
		try
		{
			File fi=new File(fo);
			if(fi.exists())
			{
				System.out.println("File already exists..");
			}
			Scanner dataReader = new Scanner(fi); 
			System.out.println("Contents in the File:");
			while (dataReader.hasNextLine())
			{ 
			  String fileData = dataReader.nextLine(); 
			  System.out.println(fileData); 
			} 
			dataReader.close(); 
		}
		catch (IOException e)
        {
            System.out.println(""+e);
            e.printStackTrace();
        }
	    
		

	}

}
