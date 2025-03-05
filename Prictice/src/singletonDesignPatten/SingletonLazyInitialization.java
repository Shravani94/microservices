package singletonDesignPatten;

public class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization(){

    }
     public static SingletonLazyInitialization getInstance(){
        if(instance==null){
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }
    public static void main(String[] ags){
        SingletonLazyInitialization initialization1 = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization initialization2 = SingletonLazyInitialization.getInstance();


        System.out.println(initialization1==initialization2);
    }
}
