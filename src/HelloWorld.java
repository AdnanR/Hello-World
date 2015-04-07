/**
 * Created by guoch on 7/04/2015.
 */
public class HelloWorld {

    public static void main(String[] args) {

        String limitaion = "Cats";
        String original = "Hello World";

        System.out.println(original + " cats " + limitaion);

        try {

            System.in.read();

        } catch(Exception e) {

            System.out.println("Cannot read");

        }
    }

}
