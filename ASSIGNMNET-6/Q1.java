

import java.io.*;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        Date curDate = new Date();
        String Date = curDate.toString();
        File f = new File("D:\\text.txt");
        try
        {
        	
			if(f.exists())
			{
				System.out.println("File already exists..");
			}
			System.out.println("Enter your diary:");
	        String diary = obj.nextLine();
	        //File fi=new File(diary);
			FileWriter fileWriter = new FileWriter(f);
            
            fileWriter.write(Date + "\n");
            fileWriter.write(diary + "\n");
            fileWriter.close();

            System.out.println("Diary entry saved successfully.");
        } 
        catch (IOException e)
        {
            System.out.println("An error occurred while writing to the diary file."+e);
            e.printStackTrace();
        }
        obj.close();
    }
}
