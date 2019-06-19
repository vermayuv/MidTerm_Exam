/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/**
 *
 * @author Sivagama
 */
public class AccountTester {
    
    public static void main(String[] args) {
        /*here assumed that 500 accounts can be created
        for the given bank*/
        Account ac[]=new Account[500];
        Account acc = new Account();
                Scanner sc=new Scanner(System.in);

        
        System.out.println("Please enter the unique user name:");
        String user=sc.nextLine();
       /* System.out.println("Please enter the amount by which you want to open an account:");
        
        double bal=sc.nextDouble();*/
        acc.repeat();
       
        
        Account a=new Account(acc.getBalance(),user);
        ac[0]=a;
             
        System.out.println("The balance is: "+a.getBalance());  
        System.out.println("The InterestRate per month is "+a.getInterestRate());
         acc.calculate(a.getBalance(),a.getInterestRate());
    }
}
