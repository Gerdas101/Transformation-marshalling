package lt.viko.eif.GJ;

/**
 * Author class which represents a child element of Book in xml document
 * It contains String fields:
 * name - the name of author
 * surname - the surname of author
 */
public class Author {
    private String name;
    private String surname;

    /**
     * Default constructor which does not take any parameters
     */
    public Author(){}

    /**
     * Constructor which takes parameters and assigns it to class fields
     * @param name      the name of author
     * @param surname   the surname of author
     */
    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return String.format(
                        "\n\t\t\t\t\tauthor: " +
                        "\n\t\t\t\t\t\tname: %s " +
                        "\n\t\t\t\t\t\tsurname: %s ", getName(), getSurname());
    }

}
