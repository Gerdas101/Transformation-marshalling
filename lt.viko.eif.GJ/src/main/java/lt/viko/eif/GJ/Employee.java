package lt.viko.eif.GJ;

import javax.xml.bind.annotation.XmlType;

/**
 * Employee class which represents a child element of library in xml document
 * It contains String fields:
 * name - the name of employee
 * surname - the surname of a employee
 * gender - employee's gender
 * Integer field:
 * age - employee's age
 */
@XmlType(propOrder = {"name", "surname", "gender", "age"})
public class Employee {
    private String name;
    private String surname;
    private String gender;
    private int age;

    /**
     * Default constructor which does not take any parameters
     */
    public Employee(){}

    /**
     * Constructor which takes parameters and assigns it to class fields
     * @param name      the name of employee
     * @param surname   the surname of employee
     * @param gender    employee's gender
     * @param age       employee's age
     */
    public Employee(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "\n\t\t\tEmployee: " +
                "\n\t\t\t\tname: %s " +
                "\n\t\t\t\tsurname: %s " +
                "\n\t\t\t\tgender: %s " +
                "\n\t\t\t\tage: %d", getName(), getSurname(), getGender(), getAge());
    }
}
