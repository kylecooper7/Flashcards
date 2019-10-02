import java.io.*;
import java.util.ArrayList;
class SetList {

    
	static ArrayList <String> listOfSets = new ArrayList <String>();
	static String line = null;
	


	
	public static void LoadSetList() throws Exception{
		
		
		String fileName = "ListOfSets";
        // The name of the file to open.


        // This will reference one line at a time


        try 
        	{
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            
        	
            
            while(((line = bufferedReader.readLine()) != null)) 
            	{
            	
                listOfSets.add(line);
                
            	}	            
            
            

            // Always close files.
            bufferedReader.close();			
        	}
        catch(FileNotFoundException ex) 
        	{
            System.out.println(
                "Unable to open file '" + fileName + "'");				
        	}
        catch(IOException ex) 
        	{
            System.out.println(
                "Error reading file '" + fileName + "'");					
            // Or we could just do this: ex.printStackTrace();
        	}
		
	}
	
	
}

