/**
 * Created by guoch on 7/04/2015.
 */
public class HelloWorld {

    public static void main(String[] args) {

        String limitaion = "test test test";

        System.out.println("Hello World " + limitaion);

        try {

            System.in.read();

        } catch(Exception e) {

            System.out.println("Cannot read");

        }
    }

}
