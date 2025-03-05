package FactoryDesignPattern;

public class PaymentFactory {
    public static Payment getPayment(String paymentType){
        if(paymentType.equalsIgnoreCase("UPI")){
            return new UpiPayment();
        }else if (paymentType.equalsIgnoreCase("CReditCard")){
            return new CreditCardPayment();
        }else if (paymentType.equalsIgnoreCase("netBanking")){
            return new NetBanking();
        }
        else
            return null;
    }
}
