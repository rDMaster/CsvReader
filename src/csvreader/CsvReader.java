/*
 * This csv file Reader was designed for reading bank statment csv files
 * and sorting the transactions. I plan on using it to see of any patterns 
 * in my spending habits.
 * 
 * 
 */
package csvreader;

/**
 *
 * @author ryan
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;       
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class CsvReader {

    
    /**
     * @param args the command line arguments
     */
    List<Transaction> allTransactions = new ArrayList< >();
    
    public static void main(String[] args) {
        // TODO code application logic here
        CsvReader obj = new CsvReader();
        obj.run();
        obj.readTransaction(); 
    }
    
    public void run(){
        
        String csvFile = "TransactionExport.csv";
        BufferedReader br = null;
        String line= "";
        
        
        
        
        try{
            //Read csv file
            br = new BufferedReader(new FileReader(csvFile));
            //exit loop when reach end of file
            while((line = br.readLine()) != null){
                
                // use comma as seperator 
                // 2nd arg sets the amount of empty strings you expect
                // -1 if it is unknown
                String[] transaction = line.split(",", -1);
                System.out.println(transaction.length );
                //add transaction object to arraylist
                allTransactions.add(new Transaction(transaction[0], transaction[1], transaction[2], transaction[3], transaction[4]));
                 
            }

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	System.out.println("Done");
  }
    
    /**
     *
     */
    public void readTransaction(){
        
        //print each transaction
        for(Transaction it : allTransactions) {
            System.out.print(it.getDate() + " ");
            System.out.print(it.getDetails() + " ");
            System.out.print(it.getDebit() + " ");
            System.out.print(it.getCredit() + " ");
            System.out.println(it.getBalance());
            
                
            }
        }
        
    }

