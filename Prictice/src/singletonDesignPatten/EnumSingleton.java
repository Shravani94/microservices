package singletonDesignPatten;

enum singletonEnum {
    INSTANCE;
    public void show(){
        System.out.println("Singleton enum");
    }
}
public class EnumSingleton{
    public static void main(String[] args){
        singletonEnum obj1 = singletonEnum.INSTANCE;
        singletonEnum obj2 = singletonEnum.INSTANCE;
        obj1.show();
        System.out.println(obj2==obj1);
    }
}
