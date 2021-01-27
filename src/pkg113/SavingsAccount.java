/*
 * Project: 11.3 
 * Name: Lauren Smith 
 * Date: 11/16/20 
 * Class for a savings account
 */
package pkg113;

/**
 *
 * @author Programming
 */
public class SavingsAccount extends Account {
    
    //invokes super constructor of account with no parameters 
    public SavingsAccount() 
    {
        super(); 
    } 
    
    //invokes super constructor of account with parameters 
    public SavingsAccount(int id, double balance, double annualInterestRate) 
    {
        super(id,balance,annualInterestRate); 
    } 
    
    //withdraws money if withdraw amount is less than or equal to balance 
    public void withdraw(double num)
    {
        if(num<=getBalance()) 
        {
            setBalance(getBalance()-num); 
        }
    }
    
}
