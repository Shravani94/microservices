package BuilderDesignPattern;

public class PhoneBuilder {
    String ram;
    String storage;
    String camera;

    public PhoneBuilder setRam(String ram){
        this.ram = ram;
        return this;
    }
    public PhoneBuilder setStorage(String storage){
        this.storage = storage;
        return this;
    }
    public PhoneBuilder setCamera(String camera){
        this.camera = camera;
        return this;
    }
    public Phone build(){
        return new Phone(this);
    }
}
