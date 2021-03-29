package com.richa;

import java.io.*;
import java.util.ArrayList;

public class Transactions extends User {

    public Transactions(String username, String password, Integer accNo, String firstName, String lastName, Double totalBalance, Double availableBalance) {
        super(username, password, accNo, firstName, lastName, totalBalance, availableBalance);
    }

    public Transactions() {

    }

    public void depositAmount(ArrayList<String> userData, int amount) {
        try{
            this.username = userData.get(0);
            this.password = userData.get(1);
            this.firstName = userData.get(2);
            this.lastName = userData.get(3);
            this.accNo = Integer.parseInt(userData.get(4));
            this.totalBalance = Double.parseDouble(userData.get(5));
            this.availableBalance = this.getTotalBalance() + amount;

                FileWriter file = new FileWriter(this.firstName+".txt");
                BufferedWriter output = new BufferedWriter(file);
                output.write("Username :" + this.getUsername() + '\n');
                output.write("Password :" + this.getPassword() + '\n');
                output.write("First Name :" + this.getFirstName() + '\n');
                output.write("Last Name :" + this.getLastName() + '\n');
                output.write("Acc No :" + this.getAccNo() + '\n');
                output.write("Balance :" + this.getAvailableBalance() + '\n');
                // Closes the writer
                output.close();

            System.out.println("You account has been updated. Your new balance is " + this.getAvailableBalance());
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void withDrawAmount(ArrayList<String> userData, int amount) throws IOException {
        this.username = userData.get(0);
        this.password = userData.get(1);
        this.firstName = userData.get(2);
        this.lastName = userData.get(3);
        this.accNo = Integer.parseInt(userData.get(4));
        this.totalBalance = Double.parseDouble(userData.get(5));
        this.availableBalance = this.getTotalBalance() - amount;
        FileWriter file = new FileWriter(this.firstName+".txt");
        System.out.println(file);
        BufferedWriter output = new BufferedWriter(file);
        output.write("Username :" + this.getUsername() + '\n');
        output.write("Password :" + this.getPassword()+ '\n');
        output.write("First Name :" + this.getFirstName() + '\n');
        output.write("Last Name :" + this.getLastName() + '\n');
        output.write("Acc No :" + this.getAccNo() + '\n');
        output.write("Balance :" + this.getAvailableBalance() + '\n');
        output.close();
        System.out.println("You account has been updated. Your new balance is " + this.getAvailableBalance());
    }


    public void displayBalance(ArrayList<String> userData) {
        System.out.println("You account no is " + Integer.parseInt(userData.get(4)) + "\n");
        System.out.println("You account balance is " + Double.parseDouble(userData.get(5))+ "\n");
    }

    public static ArrayList makeData(String u, String p) {
        try {
            ArrayList userData = new ArrayList();

            FileReader reader = new FileReader(u+".txt");

            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                userData.add(line.substring(line.lastIndexOf(":") + 1));
            }
            return userData;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
