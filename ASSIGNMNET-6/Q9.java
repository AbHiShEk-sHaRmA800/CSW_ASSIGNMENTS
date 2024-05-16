
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q9 {
	private static String formatDate(Date date) 
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return sdf.format(date);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = obj.nextLine();
        File file = new File(fileName);
        if (!file.exists()) 
        {
            System.out.println("File does not exist.");
            return;
        }
        System.out.println("*************************");
        System.out.println("* Display File metadata *");
        System.out.println("*************************");
        System.out.println("1. File name: " + file.getName());
        System.out.println("2. Absolute path: " + file.getAbsolutePath());
        System.out.println("3. File size: " + file.length() + " bytes");
        System.out.println("4. Last modified date: " + formatDate(new Date(file.lastModified())));
        System.out.print("5. Is directory: ");
        if (file.isDirectory())
        {
            System.out.println("Yes");
        } 
        else
        {
            System.out.println("No");
        }
        System.out.print("6. Is file: ");
        if (file.isFile()) 
        {
            System.out.println("Yes");
        } 
        else 
        {
            System.out.println("No");
        }
        System.out.print("7. Is hidden: ");
        if (file.isHidden()) 
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
        System.out.print("8. Can read: ");
        if (file.canRead()) 
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
        System.out.print("9. Can write: ");
        if (file.canWrite()) 
        {
            System.out.println("Yes");
        } else
        {
            System.out.println("No");
        }

        obj.close();
    }
    
}
