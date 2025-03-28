package aisco.donation.pgateway.transferbank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransferBankImpl extends DTransferBank {
    private List<Object> transferDonations;
    
    public TransferBankImpl() {
        System.out.println("Donation via Bank Transfer Payment");
        transferDonations = new ArrayList<>();
    }
    
    public TransferBankImpl(String name, String email, String phone, int amount, String bankName, 
                           String accountName, String accountNumber, String proofOfTransfer) {
        super(name, email, phone, amount, bankName, accountName, accountNumber, proofOfTransfer);
    }
    
    @Override
    public void addDonation() {
        transferDonations.add(new TransferBankImpl("Bambang", "bambang@mail.com", "081234567890", 
                                                  1000000, "BNI", "AISCO Foundation", 
                                                  "021456789", "transfer_proof_bambang.jpg"));
        transferDonations.add(new TransferBankImpl("Dina", "dina@mail.com", "087654321098", 
                                                  500000, "BRI", "AISCO Foundation", 
                                                  "021456789", "transfer_proof_dina.jpg"));
    }
    
    @Override
    public void getDonation() {
        System.out.println(Arrays.asList(transferDonations));
    }
    
    @Override
    public String toString() {
        return "- Bank Transfer Payment Donation from " + name + ": " + amount +
                ", Bank: " + bankName + ", Account: " + accountName + ", Proof: " + proofOfTransfer + "\n";
    }
}