package PrototypeDesignPattern;

public class Client {
    public static void main(String[] args){
        Employee employee1 = new Employee(1,"shravani","It-java");
        Employee employee2 = (Employee) employee1.clone();

        System.out.print("employee1 "+employee1);
        System.out.print("employee2 "+employee2);
    }
}
