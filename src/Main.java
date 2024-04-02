import java.io.*;
/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;*/

public class Main {
    public static void main(String[] args)  throws Exception{ 
    /*ONLY FOR WINDOWS MACHINES */
    String filePath = "C:\\Users\\lwc\\Downloads\\Groceries.txt";
    String fileToWrite = "C:\\Users\\lwc\\Downloads\\ABC.txt";

    String [] array = new String[4];
    String id;
    String itemName;
    String quantity;
    double price;
    //String temp = "";
    String separator = ",";
    double total = 0;

        FileReader fileReader = new FileReader(filePath);
         FileWriter fileWriter = new FileWriter(fileToWrite) ;

        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line ;

        while((line = reader.readLine()) != null){

           array = line.split(separator);

           price = Double.parseDouble(array[3]);

           total += price;
           
            System.out.println(line);
            writer.write(line);
            writer.newLine();
         
           }
              
        System.out.println( "\n"+ "Total Price of all items"+Math.round(total));
        writer.write("\n"+ "Total Price of groceries"+Math.round(total));



        reader.close();

        writer.flush();
        writer.close();
    }
   
  }
