package BuilderDesignPattern;

public class Phone {
    private String ram;
    private String storage;
    private String camera;

    @Override
    public String toString() {
        return "Phone{" +
                "ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }

    public Phone(PhoneBuilder builder){
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.camera = builder.camera;
    }

}
