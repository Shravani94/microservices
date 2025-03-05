package singletonDesignPatten;

public class SingletonWithDoubleLock {

    private static SingletonWithDoubleLock instance;

    private SingletonWithDoubleLock(){

    }
    public static SingletonWithDoubleLock getInstance(){
        if (instance==null) {
            synchronized (SingletonWithDoubleLock.class) {
                if (instance == null) {
                    instance = new SingletonWithDoubleLock();
                }
            }
        }
        return instance;
    }
    public static void main(String[] agns){
        SingletonWithDoubleLock singleton = SingletonWithDoubleLock.getInstance();
        SingletonWithDoubleLock singleton1 = SingletonWithDoubleLock.getInstance();
        System.out.println(singleton1==singleton);
    }
}
