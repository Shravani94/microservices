package CompositDesignPattern;

public class Client {
    public static void main(String[]agrs){
        Food burger = new Item("Burger",100);
        Food pizza = new Item("Pizza",200);

        Combo combo = new Combo("Combo offer");
        combo.addItem(burger);
        combo.addItem(pizza);

        Combo familyPack = new Combo("Family pack offer");
        familyPack.addItem(combo);
        familyPack.addItem(new Item("Coke",50));

        System.out.println("Combo price "+combo.getPrice());
        combo.showPrice();

        System.out.println("Family Pack Price "+familyPack.getPrice());
        familyPack.showPrice();
    }
}
