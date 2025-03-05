package FactoryDesignPattern;

public class CreditCardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment through credit card ");
    }
}
