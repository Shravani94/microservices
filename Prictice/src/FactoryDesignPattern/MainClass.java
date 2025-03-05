package FactoryDesignPattern;

public class MainClass {
    public static void main(String[] args){
        Payment payment = PaymentFactory.getPayment("upi");
        payment.pay();
    }
}
