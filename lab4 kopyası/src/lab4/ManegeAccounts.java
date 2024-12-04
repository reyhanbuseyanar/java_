package lab4;

//****************************************************************
//ManageAccounts.java
//
//Use Account class to create and manage Sally and Joe's
//bank accounts
//****************************************************************
public class ManegeAccounts
{
 public static void main(String[] args)
 {
     Account acct1, acct2;

     // Create account1 for Sally with $1000
     acct1 = new Account(1000, "Sally", 1111);

     // Create account2 for Joe with $500
     acct2 = new Account(500, "Joe", 2222);

     // Deposit $100 to Joe's account
     acct2.deposit(100);
     System.out.println("Joe's new balance after deposit: $" + acct2.getBalance());

     // Withdraw $50 from Sally's account
     acct1.withdraw(50);
     System.out.println("Sally's new balance after withdrawal: $" + acct1.getBalance());

     // Charge fees to both accounts
     double sallyNewBalance = acct1.chargeFee();
     double joeNewBalance = acct2.chargeFee();
     System.out.println("Sally's balance after fee: $" + sallyNewBalance);
     System.out.println("Joe's balance after fee: $" + joeNewBalance);

     // Change the name on Joe's account to Joseph
     acct2.changeName("Joseph");

     // Print summary for both accounts
     System.out.println("\nAccount Summary:");
     System.out.println(acct1.toString());
     System.out.println(acct2.toString());
 }


 }

