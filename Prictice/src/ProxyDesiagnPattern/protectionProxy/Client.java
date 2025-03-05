package ProxyDesiagnPattern.protectionProxy;

public class Client {
    public static void main(String[] ags){
        BankAccount account1 = new BankAccountProxy("user");
        account1.withdraw(1000);

        BankAccount account2 = new BankAccountProxy("admin");
        account2.withdraw(10000);
    }
}
