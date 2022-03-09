package com.company;

import java.util.Scanner;
public class Main {
    public static testAccount account = new testAccount();
    public static void main(String[] args) {
        System.out.println("Press the appropriate number for \nthe desired transaction to occur");
        System.out.println("1.Check balance\n2.Withdraw\n3.Transfer\n0.Exit");
        account.account(1000,10000);
        int x=0;
        while(x==0){
            statement();
        }
    }
    private static void statement() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Current balance :"+account.getBalance());
                break;
            case 2:
//                System.out.println("Enter amount to withdraw");
                System.out.print("Withdrawing Rs");
                int withdrawAmount = sc.nextInt();
                account.withdraw(withdrawAmount);
                System.out.println("Current balance :" + account.getBalance());
                break;
            case 3:
//                System.out.println("Enter amount to transfer");
                System.out.print("Transferring Rs");
                int transferAmount = sc.nextInt();
                account.transfer(transferAmount, 1234);
                System.out.println("Current balance :" + account.getBalance());
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
}
