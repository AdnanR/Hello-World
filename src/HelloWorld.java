/**
 * Created by guoch on 7/04/2015.
 */
public class HelloWorld {

    public static void main(String[] args) {

        String limitaion = "Hello";
        String original = "World";

        System.out.println(original + " master " + limitaion);

        System.out.println(original + " cats " + limitaion);

        Add add = new Add(limitaion, original);

        System.out.println(add.Add() + "cats");

        try {

            System.in.read();

        } catch(Exception e) {

            System.out.println("Cannot read");

        }
    }

}
