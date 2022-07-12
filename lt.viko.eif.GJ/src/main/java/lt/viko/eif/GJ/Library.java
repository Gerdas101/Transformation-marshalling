package lt.viko.eif.GJ;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Library class which represent a child element in xml document.
 * It contains String fields:
 * name - the name of a library,
 * city - the city where library is located to,
 * address - the address of a library.
 * Also lists:
 * book - a list of books in a library,
 * employee - a list of employees working in a library
 */
@XmlType(propOrder = {"name", "city", "address", "book", "employee"})
public class Library {
    private String name;
    private String city;
    private String address;
    private List<Book> book = new ArrayList<>();
    private List<Employee> employee = new ArrayList<>();

    /**
     * Default constructor which does not take any parameters
     */
    public Library(){}

    /**
     * Constructor which takes parameters and assigns it to class fields
     * @param name    the name of library
     * @param city    the city where library is located to
     * @param address  the address of a library
     */
    public Library(String name, String city, String address){
        this.name=name;
        this.city=city;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @XmlElementWrapper(name = "books")
    public List<Book> getBook() {
        return book;
    }
    public void setBook(List<Book> book) {
        this.book = book;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @XmlElementWrapper(name = "employees")
    public List<Employee> getEmployee() {
        return employee;
    }
    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    /**
     * takes Book object as a parameter and adds it to book list
     * by getting list and using add() function
     * @param book  whatever Book object is passed will be added in a list
     */
    public void addBook(Book book) {
        this.getBook().add(book);
    }

    /**
     * takes Employee object as a parameter and adds it to employee list
     * by getting list and using add() function
     * @param employee whatever Employee object is passed will be added in a list
     */
    public void addEmployee(Employee employee) {
        this.getEmployee().add(employee);
    }

    /**
     * Each Book object is added in string variable.
     * @return finalResult all Book objects in String format
     */
    private String printBook(){
        String finalResult = "";
        for(Book book : getBook()){
            finalResult += book;
        }
        return finalResult;
    }
    /**
     * Each Employee object is added in string variable.
     * @return finalResult all Employee objects in String format
     */
    private String printEmployee(){
        String finalResult = "";
        for(Employee employee : getEmployee()){
            finalResult += employee;
        }
        return finalResult;
    }

    @Override
    public String toString() {
        return String.format(
                "\n\tLibrary: " +
                        "\n\t\tname: %s, " +
                        "\n\t\tcity: %s, " +
                        "\n\t\taddress: %s, " +
                        "\n\t\tBooks: %s, " +
                        "\n\t\tEmployees: %s", getName(), getCity(), getAddress(), printBook(), printEmployee());
    }

}
