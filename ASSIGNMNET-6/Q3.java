

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Q3 {

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
			System.out.println("Enter your new diary:");
            String diary = obj.nextLine();
			FileWriter fileWriter = new FileWriter(diary);
            
    		Date curDate = new Date();
            String Date = curDate.toString();
            fileWriter.write(Date + "\n");
            fileWriter.write(diary + "\n");
            fileWriter.close();

            System.out.println("Diary entry saved successfully.");
		}
		catch (IOException e)
        {
            System.out.println(""+e);
            e.printStackTrace();
        }

	}

}
