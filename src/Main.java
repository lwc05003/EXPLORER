import java.io.*;

public class Main {
    public static void main(String[] args)  throws Exception{ 
    /*ONLY FOR WINDOWS MACHINES */
    String filePath = "C:\\Users\\lwc\\Downloads\\Groceries.txt";
    String fileToWrite = "C:\\Users\\lwc\\Downloads\\GroceriesFormatted.txt";

    String [] array = new String[4];
    int id;
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

        
        writer.write("****************************************************");
        String heading ="ID#" + "\t" + "Item " + "\t\t" + "Quantity" + "\t" + "Price (€)." ;
        System.out.println(heading);
        writer.newLine();
        writer.write(heading);
        writer.newLine();
        String line ;
        //ID# Item Name Item Quantity Price (€).

        while((line = reader.readLine()) != null){

           array = line.split(separator);
           

           id = Integer.parseInt(array[0]);

           itemName = array[1];

           quantity = array[2];

           price = Double.parseDouble(array[3]);

           total +=  price;

           if(itemName.length()<5 && quantity.length()<4){
             line= id + "\t" + itemName + "\t\t\t" + quantity + "\t\t\t" + price;
           }
           else if(itemName.length()>=5 && quantity.length()<4){
            line= id + "\t" + itemName + "\t\t" + quantity + "\t\t\t" + price;
           }
           else{
            line= id + "\t" + itemName + "\t\t" + quantity + "\t\t" + price;
           }
           System.out.println(line);
            writer.write(line);
            writer.newLine();
         
           }
              
        System.out.println( "\n"+ "Total Price of all items"+Math.round(total));
        writer.write("****************************************************");
        writer.write("\n"+ "Total Price of groceries is :€ "+Math.round(total));
        writer.write("\n"+"****************************************************");



        reader.close();

        writer.flush();
        writer.close();
    }
   
  }

