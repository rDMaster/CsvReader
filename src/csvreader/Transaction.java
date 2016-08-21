/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvreader;

/**
 *
 * @author ryan
 */
public class Transaction {
    
// instance variables
    private final String date;
    private final String details;
    private final String debit;
    private final String credit;
    private final String balance;
    
    
    /**
     * Constructor
     * @param date
     * @param details
     * @param debit
     * @param credit
     * @param balance
     */
    public Transaction(String date, String details, String debit, String credit, String balance){
        
        this.date = date;
        this.details = details;
        this.debit = debit;
        this.credit = credit;
        this.balance = balance;
        
    }
    

    /**
     * @return the date
     */
    public String getDate() {
        return String.format("%-10s",this.date);
    }

    /**
     * Needs padding to 25 chars
     * @return the details
     */
    public String getDetails() {
        if("".equals(this.details)){
            
            return String.format("%-24s" , this.details);
        }else{
            return String.format("%-24s", this.details);
        }
    }

    /**
     * @return the debit
     */
    public String getDebit() {
        
        
        return String.format("%-6s",this.debit);
    }

    /**
     * @return the credit
     */
    public String getCredit() {
        return String.format("%-7s",this.credit);
    }

    /**
     * @return the balance
     */
    public String getBalance() {
        return String.format("%-8s",this.balance);
    }
    
}
