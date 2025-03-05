package ProxyDesiagnPattern.protectionProxy;

public class BankAccountProxy implements BankAccount{

    private RealBankAccount realBankAccount;
    private String userRole;

    public BankAccountProxy(String userRole){
        this.userRole= userRole;
        this.realBankAccount = new RealBankAccount();
    }
    @Override
    public void withdraw(double amount) {
        if(userRole.equalsIgnoreCase("Admin")){
            realBankAccount.withdraw(amount);
        }else {
            System.out.println("Access Denied !");
        }
    }
}
