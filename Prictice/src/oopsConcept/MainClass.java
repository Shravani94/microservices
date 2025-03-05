package oopsConcept;

public class MainClass {
    public static void main(String[] args){
        User user = new User();
        if(user instanceof CustomMarkerInterface){
            System.out.println("User has permissions");
        }else {
            System.out.println("user doesn't has permission");
        }
    }
}
