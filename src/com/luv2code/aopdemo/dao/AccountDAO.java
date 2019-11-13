package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;


    public void addAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean doWork(){
        System.out.println(getClass() + ": doWork()");
        return false;
    }

    public List<Account> findAccounts(boolean tripWire){
        if(tripWire){
            throw new RuntimeException("No soup for you!!!");
        }
        List<Account> myAccounts = new ArrayList<>();
        myAccounts.add(new Account("John","Silver"));
        myAccounts.add(new Account("Madhu","Platinum"));
        myAccounts.add(new Account("Luca","Gold"));
        return myAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
}
