package singletonDesignPatten;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("Singleton Object Created");
    }
    public static Singleton getSingleton(){
        return singleton;
    }

    public static void main(String[] ags){
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
       System.out.println (singleton2==singleton1);
        System.out.println (singleton2.equals(singleton1));

        }


    }
