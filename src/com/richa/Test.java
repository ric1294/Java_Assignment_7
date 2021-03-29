package com.richa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter Username:");
        String u= sc.nextLine();
        System.out.print("Enter Password:");
        String p= sc.nextLine();
        if(u.equals("Richa") ||u.equals("Joy")||u.equals("Marry")||u.equals("Denin")){

            System.out.println("1: Deposit");
            System.out.println("2: Withdrawal");
            System.out.println("3: Check Balance");
            System.out.println("4: Program termination");

            lp : while(true)
            {
                Transactions t = new Transactions();
                System.out.print("Make your choice: ");
                ArrayList userData = t.makeData(u , p);
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter the amount you want to deposit \n");
                        int depositAmount = sc.nextInt();
                        t.depositAmount(userData, depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter the amount you want to withdraw \n");
                        int withDrawAmount = sc.nextInt();
                        t.withDrawAmount(userData, withDrawAmount);
                        break;
                    case 3:
                        t.displayBalance(userData);
                        break;
                    case 4:

                        break lp;
                    default:
                        System.out.println("Invalid choice! Please make a valid choice. \n\n");
                }
            }
        }else{
                System.out.println("Wrong Username/Password");
        }

    }
}
