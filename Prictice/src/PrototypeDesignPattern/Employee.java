package PrototypeDesignPattern;

public class Employee implements Prototype{
    private int id;
    private String name;
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public Prototype clone() {
        return new Employee(id,name,department);
    }
}
