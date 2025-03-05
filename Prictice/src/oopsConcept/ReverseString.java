package oopsConcept;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    private static ReverseString instance ;
    private ReverseString(){
    }
    public static ReverseString getInstance() {
        if (instance == null) {
            synchronized (ReverseString.class) {
                if (instance == null) {
                    instance = new ReverseString();
                }
            }

        }
        return instance;
    }

    public String reverseString(String text){

        StringBuilder newString= new StringBuilder();
        if(!text.isEmpty()&& text!=null){
            for(int i=text.length()-1;i>=0;i--){
                newString.append(text.charAt(i));
            }
            return newString.toString();
        }else {
            return "text should not be empty or null";
        }
    }

    public boolean isPalindrome(){
        ReverseString obj1 = ReverseString.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String ");
        String  text = sc.next();
        String string1 = obj1.reverseString(text);
        return string1.equals(text);

    }
    public int[] fibonacciSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number where we need to start");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        System.out.println("enter how many number need you want to print");
        int range = sc.nextInt();
        int[] result = new int[range];
        result[0]=num1;
        result[1] = num2;
        for(int i=2;i<range;i++){
            int value = num1+num2;
            num1 = num2;
            num2 = value;
            result[i]= value;
        }
        return result;
    }
    public static void main(String[] args){
        ReverseString obj2 = ReverseString.getInstance();
        String result = obj2.reverseString("Shravani");
        System.out.println("the reverse String is "+result);
        boolean value = obj2.isPalindrome();
        if (value){
          System.out.println("Given String is a Palindrome");
        }else {
            System.out.println("Given String is not a palindrome");
        }
        int[] series = obj2.fibonacciSeries();
       Arrays.stream(series).forEach(num->System.out.print(num));
    }
}
