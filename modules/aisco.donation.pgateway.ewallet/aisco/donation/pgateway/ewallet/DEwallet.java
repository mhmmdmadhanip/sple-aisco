package aisco.donation.pgateway.ewallet;

import aisco.donation.core.Donation;

public abstract class DEwallet implements Donation {
    protected String name;
    protected String email;
    protected String phone;
    protected int amount;
    protected String ewalletProvider;
    
    public DEwallet() {
        
    }
    
    public DEwallet(String name, String email, String phone, int amount, String ewalletProvider) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
        this.ewalletProvider = ewalletProvider;
    }
    
    public abstract void addDonation();
    public abstract void getDonation();
}