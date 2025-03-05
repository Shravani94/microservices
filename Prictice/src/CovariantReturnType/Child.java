package CovariantReturnType;

public class Child extends Parent{
    @Override
    public Child display(){
        System.out.println("child class");
        return this;
    }
}
