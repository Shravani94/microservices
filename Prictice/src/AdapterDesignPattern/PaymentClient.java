package AdapterDesignPattern;

import FactoryDesignPattern.Payment;

public class PaymentClient {
    public static void main(String[] args){
        PaymentGateway payment1 =  PaymentFactory.getPayment("paypal");
        payment1.processPayment(1000);

    }
}
