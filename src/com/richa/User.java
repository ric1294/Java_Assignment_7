package com.richa;

abstract class User implements IDisplay {
    String username;
    String password;
    Integer accNo;
    String firstName;
    String lastName;
    Double totalBalance;
    Double availableBalance;

    public User(String username, String password, Integer accNo, String firstName, String lastName, Double totalBalance, Double availableBalance) {
        this.username = username;
        this.password = password;
        this.accNo = accNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAccNo() {
        return accNo;
    }

    public void setAccNo(Integer accNo) {
        this.accNo = accNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(Double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    @Override
    public void displayBalance(){
        System.out.println("Display Data");
    }
}
