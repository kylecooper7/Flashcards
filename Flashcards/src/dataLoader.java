import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class dataLoader {

    
    
	static String line = null;
	static String wordList[] = new String [10];
	static ArrayList <FlashCard> theSet = new ArrayList <FlashCard>();

	
	public static void LoadTheFlashcards(String fileName) throws Exception{
		
		

        // The name of the file to open.


        // This will reference one line at a time


        try 
        	{
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            String theAnswer = "";
        	String theQuestion = "";
            
            while(((line = bufferedReader.readLine()) != null)) 
            	{
            	
                wordList = line.split(" ");
                if(wordList[0].equals("Question:")) {
                	theQuestion = line.substring(wordList[0].length() + 1, line.length());
                }
				if(wordList[0].equals("Answer:")) {
					theAnswer = line.substring(wordList[0].length() + 1, line.length());
				}
				if(line.equals("")) {
					theSet.add(new FlashCard(theQuestion, theAnswer));
				}
				
                
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
