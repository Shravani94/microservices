package CompositDesignPattern;

public class Item implements Food{
    private String name;
    private int price;

    public Item(String name, int price){
        this.name=name;
        this.price =price;
    }
    @Override
    public void showPrice() {
        System.out.print(name+ " "+price);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
