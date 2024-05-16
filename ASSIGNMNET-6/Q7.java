

import java.io.*;

public class Q7 
{
	private static void copyFile(File sourceFile, File destinationFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                writer.write(line);
                writer.newLine();
            }
        }
    }
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try 
        {
            System.out.println("Enter the source file path:");
            String source = reader.readLine();
            File sourceFile = new File(source);
            if (!sourceFile.exists() || !sourceFile.isFile()) 
            {
                System.out.println("Source file does not exist or is not a file.");
                return;
            }
            System.out.println("Enter the destination file path:");
            String destination = reader.readLine();
            File destinationFile = new File(destination);
            if (destinationFile.exists())
            {
                System.out.println("Destination file already exists. Do you want to overwrite it? (yes/no)");
                String confirm = reader.readLine().toLowerCase();
                if (!confirm.equals("yes"))
                {
                    System.out.println("Copy operation cancelled.");
                    return;
                }
            }
            copyFile(sourceFile, destinationFile);
            System.out.println("File content copied successfully.");

        }
        catch (IOException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
