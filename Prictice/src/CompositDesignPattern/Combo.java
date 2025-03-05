package CompositDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Food{
    private String name;
    private List<Food> items = new ArrayList<>();
    public Combo(String name){
        this.name= name;
    }
    public void addItem(Food item){
        items.add(item);
    }
    @Override
    public void showPrice(){
        System.out.print(name);
        for(Food item : items){
            item.showPrice();
        }
    }

    @Override
    public int getPrice() {
        int total =0;
        for (Food item :items){
            total+= item.getPrice();
        }
        return total;
    }
}
