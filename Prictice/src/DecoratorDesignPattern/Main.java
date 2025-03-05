package DecoratorDesignPattern;

public class Main {
    public static void main(String[] agns){
        Car car = new BasicCar();
        System.out.println(car.getFeatures());

        car = new SportsFeatures(car);
        System.out.println(car.getFeatures());

        //removing features
        if(car instanceof CarDecorator){
            car= ((CarDecorator) car).unWrapFeature();
        }
        System.out.println(car.getFeatures());

        car= new LuxuryFeatures(car);
        System.out.println(car.getFeatures());

        if(car instanceof CarDecorator){
            car= ((CarDecorator) car).unWrapFeature();
        }
        System.out.print(car.getFeatures());
    }
}
