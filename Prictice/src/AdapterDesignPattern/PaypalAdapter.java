package AdapterDesignPattern;

public class PaypalAdapter implements PaymentGateway{
    private Paypal paypal;

    public PaypalAdapter(Paypal paypal){
        this.paypal = paypal;
    }
    @Override
    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}
