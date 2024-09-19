package com.rest.Model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Bank {

    @Id
    private int accountNo;
    private String name;
    private String password;
    private double amount;
    private String address;
    private long mobileNo;

    @Enumerated(EnumType.STRING)
    private AccountStatus status = AccountStatus.ACTIVE;

    public enum AccountStatus {
        ACTIVE, INACTIVE
    }

    public Bank() {
    }

    public Bank(int accountNo, String name, String password, double amount, String address, long mobileNo, AccountStatus status) {
        this.accountNo = accountNo;
        this.name = name;
        this.password = password;
        this.amount = amount;
        this.address = address;
        this.mobileNo = mobileNo;
        this.status = status;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNo=" + accountNo +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                ", address='" + address + '\'' +
                ", mobileNo=" + mobileNo +
                ", status=" + status +
                '}';
    }
}
