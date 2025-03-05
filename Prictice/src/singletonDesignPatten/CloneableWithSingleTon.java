package singletonDesignPatten;

public class CloneableWithSingleTon implements Cloneable {

    private static CloneableWithSingleTon instance;

    private CloneableWithSingleTon(){

    }
    public static CloneableWithSingleTon getInstance(){
        if (instance==null){
            synchronized (CloneableWithSingleTon.class){
                if (instance==null){
                     instance = new CloneableWithSingleTon();
                }
            }
        }
        return instance;
    }
// cloneable brok the singleton
    /*@Override
    public Object clone() {
        try {
            return (CloneableWithSingleTon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }*/
// preventing cloning
    @Override
    public Object clone()throws CloneNotSupportedException{
            throw new CloneNotSupportedException("cloneable not support for singleton");
    }

    public static void main(String[] args){
        try {
            CloneableWithSingleTon singleTon = CloneableWithSingleTon.getInstance();
            CloneableWithSingleTon singleTon1 = (CloneableWithSingleTon) singleTon.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
    }
}
