package org.example;

public class VendingmachineMain {
    public static void main(String[] args) {
        Vendingmachine vm1 = new Vendingmachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);

        Vendingmachine.printVersion();
    }
}
