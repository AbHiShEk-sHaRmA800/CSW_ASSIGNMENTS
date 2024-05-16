
import java.io.File;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any Path:");
		String path=obj.nextLine();
		File f=new File(path);
		if(f.exists())
		{
			f.delete();
		    System.out.println("The file "+path+" deleted Sucessfully..." );
		}
		else
			System.out.println("The file not Exist!!!!!" );

	}

}
