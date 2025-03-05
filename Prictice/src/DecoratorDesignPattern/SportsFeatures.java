package DecoratorDesignPattern;

public class SportsFeatures extends CarDecorator {
    public SportsFeatures(Car car) {
        super(car);
    }
    public String getFeatures(){
        return car.getFeatures()+" +Sports Features";
    }
}
