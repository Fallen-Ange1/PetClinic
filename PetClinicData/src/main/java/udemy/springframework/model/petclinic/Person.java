package udemy.springframework.model.petclinic;

public class Person extends BaseEntity{

    private String firstName;
    private String lastName;

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
