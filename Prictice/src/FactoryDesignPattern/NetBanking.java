package FactoryDesignPattern;

public class NetBanking implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment through net banking");
    }
}
