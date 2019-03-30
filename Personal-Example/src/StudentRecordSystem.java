import java.util.*;
import java.io.*;

public class StudentRecordSystem 
{
	public static final String DELIM = "/t";
	//DELIMITOR is a "keyword" that the computer looks for that breaks up text
	public static void recordToFile(Student[] students, String aFile)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFile), false);
			//Header
			fileWriter.println("Number of students " + DELIM + students.length);
			//Body
			for (int i = 0; i < students.length; i++)
			{
				fileWriter.println(students[i].getName() + DELIM + students[i].getStudentNumber());
			}
			fileWriter.close();
		}
		catch (Exception e)
		{
			
		}
	}
		
		
		public static Student[] readFromFile(String aFileName)
		{
			if(aFileName == null)
				return null;
			try
			{
				Scanner fileScanner = new Scanner(new File(aFileName));
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				Student[] retStudents;
				if(splitLines.length == 2)
				{
					retStudents = new Student[Integer.parseInt(splitLines[1])];
				}
				else
					return null;
				int studentCount = 0;
				while(fileScanner.hasNextLine())
				{
					fileLine = fileScanner.nextLine();
					splitLines = fileLine.split(DELIM);
					if(splitLines.length == 2)
					{
						String name = splitLines[0];
						int studentNumber = Integer.parseInt(splitLines[1]);
						retStudents[studentCount] = new Student(name, studentNumber);
						studentCount++;
					}
				}
				fileScanner.close();
				return retStudents;
			}
			catch(Exception e)
			{
				
			}
		}
	}

