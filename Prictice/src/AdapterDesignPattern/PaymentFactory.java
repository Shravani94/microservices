package AdapterDesignPattern;
// implementing factory design pattern along with adapter
public class PaymentFactory {
    public static PaymentGateway getPayment(String type){
        if(type.equalsIgnoreCase("PayPal")){
            return new PaypalAdapter(new Paypal());
        }else if (type.equalsIgnoreCase("RazorPay")){
            return new RazorPayAdapter(new RazorPay());
        }
        return null;
    }
}
