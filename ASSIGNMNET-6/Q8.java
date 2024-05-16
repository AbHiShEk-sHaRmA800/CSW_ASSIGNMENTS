

import java.io.File;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Current File Name:");
		String curfile=obj.nextLine();
		System.out.println("Enter the new File Name for Rename:");
		String renamefile=obj.nextLine();
		File cur=new File(curfile);
		File mod=new File(renamefile);
		boolean flag=cur.renameTo(mod);
		if(flag==true)
		{
			System.out.println("The file renamed Sucessfully..");
		}
		else
		{
			System.out.println("Rename Operation Failed"); 
		}

	}

}
