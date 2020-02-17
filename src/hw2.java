import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class hw2 {
	String[] names;
	static ArrayList<String> attributes;
	ArrayList<String> trainingData;
	

	  public static void main(String[] args) {
		  
		//getData("src\\GRT.txt");
		getData("src\\GR.txt");
		getData("src\\keys.txt");
		
		
		
	   
	  }


	private static void getData(String path) {
		int x = 0;
		 try {
		      File myObj = new File("C:\\Users\\vanil\\eclipse-workspace\\LocalizationDM\\src\\GR.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        
		        if(x<9) {
		        for(String e: data.split(","))
		        	{
		        	attributes.add(e);
		        	x++;
		        	}
		        }
		        
		        System.out.println(attributes);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
	}



