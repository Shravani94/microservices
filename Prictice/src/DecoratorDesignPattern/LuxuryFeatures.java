package DecoratorDesignPattern;

public class LuxuryFeatures extends CarDecorator{
    public LuxuryFeatures(Car car) {
        super(car);
    }
    public String getFeatures(){
        return car.getFeatures()+" +Luxury Features ";
    }
}
