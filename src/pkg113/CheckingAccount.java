/*
 * Project: 11.3 
 * Name: Lauren Smith 
 * Date: 11/16/20 
 * Class for a checking account
*/
package pkg113;

import java.util.Date;

/**
 *
 * @author Programming
 */
public class CheckingAccount extends Account {
    
    private double over; 
    
    //invokes super constructor without parameters and sets overdraft limit
    
    public CheckingAccount(double over) 
    {
        super(); 
        this.over=over; 
        
    } 
    
    //invokes super constructor with parameters sets overdraft limit
    
    public CheckingAccount(int id, double balance, double annualInterestRate, double over) 
    {
        super(id,balance,annualInterestRate); 
        this.over=over; 
    }  
    
   //withdraws if withdraw amount is less than or equal balance or less than or
    //equal to withdraw amount 
    public void withdraw(double num) 
    {
        if(num<=getBalance()||num<=over) 
        {
            setBalance(num+=getBalance());
        } 
    }
    
    {
        
    }
    
            
}
