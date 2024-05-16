

import java.io.File;
import java.util.Scanner;

public class Q10 {
	private static void FilesRecursively(File directory, int depth) {
	    File[] files = directory.listFiles();
	    if (files != null) {
	        int count = 1;
	        for (File file : files)
	        {
	            for (int i = 0; i < depth; i++) 
	            {
	                System.out.print("  ");
	            }
	            System.out.println(count + " " + file.getName());
	            count++;
	            if (file.isDirectory())
	            {
	                FilesRecursively(file, depth + 1);
	            }
	        }
	        System.out.println();
	        System.out.println("We get total " +(count-1)+ " sub Dirctories in this file " +directory);
	    }
	}


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
        System.out.println("**************************************************************");
        System.out.println("* Contents of directory: " + directory.getAbsolutePath() + " *");
        System.out.println("**************************************************************");
        System.out.println();
        FilesRecursively(directory, 0);

        obj.close();
    
    }
}

