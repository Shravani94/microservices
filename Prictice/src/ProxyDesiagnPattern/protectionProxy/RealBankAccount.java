package ProxyDesiagnPattern.protectionProxy;

public class RealBankAccount implements BankAccount{
    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn "+amount);
    }
}
