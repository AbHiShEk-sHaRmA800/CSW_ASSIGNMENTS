

import java.io.File;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the directory path:");
        String Path = obj.nextLine();
        File directory = new File(Path);
        if (!directory.exists() || !directory.isDirectory()) 
        {
            System.out.println("The specified directory does not exist.");
            return;
        }
        File[] files = directory.listFiles();
        System.out.println("Files and subdirectories in " + directory.getAbsolutePath() + ":");
        for (File file : files) 
        {
            if (file.isFile())
            {
                System.out.println("File: " + file.getName());
            } 
            else if (file.isDirectory())
            {
                System.out.println("Directory: " + file.getName());
            }
        }

        obj.close();
    }
}

