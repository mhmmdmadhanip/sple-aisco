package aisco.donation.pgateway.virtualaccount;

import aisco.donation.core.Donation;

public abstract class DVirtualAccount implements Donation {
    protected String name;
    protected String email;
    protected String phone;
    protected int amount;
    protected String bankName;
    protected String accountNumber;
    
    public DVirtualAccount() {
        
    }
    
    public DVirtualAccount(String name, String email, String phone, int amount, String bankName, String accountNumber) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }
    
    public abstract void addDonation();
    public abstract void getDonation();
}