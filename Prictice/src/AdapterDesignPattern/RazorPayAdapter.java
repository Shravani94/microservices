package AdapterDesignPattern;

public class RazorPayAdapter implements PaymentGateway{
    private RazorPay razorPay;
    public RazorPayAdapter(RazorPay razorPay){
        this.razorPay=razorPay;
    }
    @Override
    public void processPayment(double amount) {
        razorPay.makePayment(amount);
    }
}
