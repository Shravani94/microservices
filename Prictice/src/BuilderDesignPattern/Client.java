package BuilderDesignPattern;

public class Client {
    public static void main(String[] args){
        Phone phone = new PhoneBuilder().setRam("120Gb").setStorage("1024GB").build();
        System.out.print(phone);
    }
}
