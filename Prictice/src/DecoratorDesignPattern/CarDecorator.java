package DecoratorDesignPattern;

abstract class CarDecorator implements Car {
    protected Car car;
    public CarDecorator(Car car){
        this.car=car;
    }
    public String getFeatures(){
        return car.getFeatures();
    }
    public Car unWrapFeature(){
        return car;
    }
}
