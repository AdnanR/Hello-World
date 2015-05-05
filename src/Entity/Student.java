package Entity;

/**
 * Created by guoch on 9/04/2015.
 */
public class Student {
    private String firstName="Rockey";
    private String lastName="Desousa";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
