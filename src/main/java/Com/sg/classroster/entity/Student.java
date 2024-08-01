package Com.sg.classroster.entity;
import java.util.Objects;

public class Student {
    private int id;

    @NotBlank(message = "First name must not be empty.")
    @Size(max = 30, message="First name must be less than 30 characters.")
    private String firstName;

    @NotBlank(message = "Last name must not be empty.")
    @Size(max = 50, message="Last name must be less than 50 characters.")
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

}
