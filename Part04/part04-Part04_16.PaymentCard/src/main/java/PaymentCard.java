/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author midistle
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        if(balance >= 2.6) {
            balance -= 2.6;
        }
    }
    
    public void eatHeartily() {
        if(balance >= 4.6) {
            balance -= 4.6;
        }
    }
    
    public void addMoney(double amount) {
        if(amount >= 0) {
            if((balance+amount) <= 150.0) {
                balance += amount;
            } else {
                balance = 150.0;
            }
        }
    }
}
