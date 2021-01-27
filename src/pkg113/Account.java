/*
 * Project: 9.7 Account class. 
 * Name: Lauren Smith 
 * Date: 11/13/20 
 * Class for a bank account
*/
package pkg113;
import java.util.Date;
public class Account 
{
    //declares all the private class vars 
    private int id; 
    private double balance; 
    private double annualInterestRate;
    private Date dateCreated; 
    
    //default constructor that sets id,balance and annual interest to 0 
    
    public Account() 
    {
        id=0; 
        balance=0; 
        annualInterestRate=0;
        dateCreated=new Date(); 
    }
    
    //parameter constructor setting the three vars to specified values
    
    public Account(int id, double balance, double annualInterestRate) 
    {
        this.id=id; 
        this.balance=balance; 
        this.annualInterestRate=annualInterestRate; 
        dateCreated=new Date(); 
    }
    
    //getters and setters for all vars 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public String getdateCreated() 
    {
        return dateCreated.toString(); 
    }
    
    //gets monthly interest by dividing annual by 12 
    //formats decimal using Math.round for toString method
    public Double getMonthlyInterestRate() 
    {
        double num=annualInterestRate/12; 
        num=Math.round(num*100.0)/10.0;
        return num; 
    } 
    
    public double getMonthlyInterest() 
    { 
        //makes monthly interest not a percent by dividing by 100
        double interest=getMonthlyInterestRate()/100;  
        //multiplies balance by the interest 
        return balance*interest; 
       
    } 
   
    //withdraws money from the account, subtracts withdrawn from num
    
    public void withdraw(double num) 
    {
        balance-=num; 
        
    } 
    
    //deposits money in accout, adds deposit to balance 
    
    public void deposit(double num) 
    {
        balance+=num; 
    } 
    
    public String toString() 
    {
         
        return("the account balance is "+ balance+" with a monthly interest of "+ getMonthlyInterestRate()+"% and was created on "+getdateCreated()); 
    }
}

