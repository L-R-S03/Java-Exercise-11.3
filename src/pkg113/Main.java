/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg113;

/**
 *
 * @author Programming
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Account basic=new Account(100,20000.00,2.5); 
       SavingsAccount savings=new SavingsAccount(150,1000,2.7); 
       CheckingAccount checking=new CheckingAccount(200,2000,3.2,500); 
       savings.withdraw(500); 
       checking.deposit(11500); 
       System.out.println(basic.toString()); 
       System.out.println(savings.toString()); 
       System.out.println(checking.toString());
    }
    
}
