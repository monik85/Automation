package SeleniumScripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Textfilehandling {
	
	

	public static void main(String[] args) throws Exception 
	{
		Textfilehandling.ReadFile();
		
	}
	
		
	
	public static void ReadFile() throws Exception
	{
		File f = new File("C:\\Users\\Praveen\\OneDrive\\Documents\\textfilehandling.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		/*String Lineval = br.readLine();
		System.out.println(Lineval);*/
		
		/*String Lineval2 = br.readLine();
		System.out.println(Lineval2);
		
		String Lineval3 = br.readLine();
		System.out.println(Lineval3);*/
		
		String content;
		while((content = br.readLine()) !=null)
		{
			String Lineval = br.readLine();
			System.out.println(content);
			
		}
			
	}
      public static void writeDate() throws Exception
      {

  		File f = new File("C:\\Users\\Praveen\\OneDrive\\Documents\\textfilehandling.txt");
  		FileWriter fw = new FileWriter(f);
  		BufferedWriter bw = new BufferedWriter(fw); 
  		bw.write("This is written using Automation");
  		bw.close();
  		
      }
	}


