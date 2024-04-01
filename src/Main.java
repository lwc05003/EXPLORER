import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args)  throws Exception{ 
    /*ONLY FOR WINDOWS MACHINES */
    String filePath = "C:\\Users\\lwc\\Downloads\\Groceries.txt";

    String [] array = new String[4];
    String id;
    String itemName;
    String quantity;
    double price;
    //String temp = "";
    String separator = ",";
    double total = 0;

    FileReader fileReader = new FileReader(filePath);
    BufferedReader reader = new BufferedReader(fileReader);

    String line ;

    while((line = reader.readLine()) != null){

       array = line.split(separator);

       price = Double.parseDouble(array[3]);

       total += price;
       
        System.out.println(line);
     
       }
          
    System.out.println( "\n"+ "Total Price of all items"+Math.round(total));

    reader.close();
   
    }
}
