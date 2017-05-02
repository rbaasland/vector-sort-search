//Ronald Baasland
//Lab8
//Oct. 30, 2008


import java.io.*;
import java.util.*;
import java.util.Iterator;

public class Lab8 
{		
	static DynamicVector vec;	
	
	public static void main(String[] args)
	{		
		String fileName = null;
		String newFileName = null;
		String target = null;		
		int choice;
		Scanner in = new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println("1- Enter a new file name.");
		System.out.println("2- Sort the vector in ascending order.");
		System.out.println("3- Sort the vector in descending order.");
		System.out.println("4- Search for a particular item from a file.");
		System.out.println("5- Quit");
		
		System.out.println("Please enter the number from the menu that corresponds to your choice: ");
		choice = in.nextInt();
		
		if (choice == 1)
		{
			System.out.println("Please insert a file name: ");
			fileName = in.next();
			readFile(fileName,vec);
		}	
		if (choice == 2)	
		{
			if (vec.isEmpty())
				System.out.println("You did not read in a file, or the file is empty!");
			else
				Sort.insertionSort(vec, 0, 10);
		}
		if (choice == 3)
			Sort.insertionSort(vec, 0, 10);
		if (choice == 4)
		{
			System.out.println("What do you want to search for?");
			target = in.next();
			Search.linearSearchSorted(vec, target);
		}
		if (choice == 5)
			System.out.println("Thank you for using the program!");			
		if (choice == 6)
		{
			System.out.println("Please pick a file to write:");
			newFileName = in.next();
			writeFile(newFileName,vec);
		}
		else
			System.out.println("That is not a valid choice, Please choose again!");				
									
	}
	
	public Lab8()
	{		
		vec = new DynamicVector();
		String in = "example";
		
		System.out.println("Main Menu");
		System.out.println("1- Enter a new file name.");
		System.out.println("2- Sort the vector in ascending order");
		
		
		readFile(in,vec);
		
		
	}
	
	public static void readFile(String inFile, DynamicVector vec1)
	{
		Scanner input;
		String justRead = null;
		System.out.println("Will now attempt to read a file "+inFile);
		try
		{
			input = new Scanner(new File(inFile));
			while (input.hasNext())
			{
				justRead = input.nextLine();
				System.out.println(justRead);
				vec.append(justRead);
			}
			input.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("The input file "+inFile+" was not found.");
			return;
		}
		catch(IOException e)
		{
			System.out.println("Error reading from file " + inFile);
		}
		
		
		
	}
	
	public static void writeFile(String outFile, DynamicVector vec)
	{
		PrintWriter pOut;
		System.out.println("Will now attempt to write to file "+outFile);
		try
		{
			pOut = new PrintWriter (new FileOutputStream (outFile));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("The output file"+outFile+" was not found.");
			return;
		}
		for(Iterator iter = vec.iterator(); iter.hasNext();)
		{
			String word = (String)iter.next();
			System.out.println(word);
				pOut.println(word);			
		}
		pOut.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
