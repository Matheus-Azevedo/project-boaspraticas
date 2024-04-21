package br.unipe.boaspraticas.exercicios.oc;

public class Purchase {
    private double totalPurchaseAmount;
    private Customer customer;
    private EmailSystem emailSystem;

    public Purchase() {
        this.totalPurchaseAmount = 0;
    }

    public void addToTotalPurchaseAmount(double amount) {
        this.totalPurchaseAmount+= amount;
    }
    public void makePurchase(double amount) {
        if (customer.getAge() >= 18) {
            emailSystem.sendEmailReceipt(amount);
        }
        if (amount > 0) {
            addToTotalPurchaseAmount(amount);
            System.out.println("Purchase successful!");
        }
        System.out.println("Invalid purchase amount!");
    }
}
