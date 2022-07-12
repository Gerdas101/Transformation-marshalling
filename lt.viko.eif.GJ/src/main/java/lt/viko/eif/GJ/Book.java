package lt.viko.eif.GJ;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Book class which represents a child element of library in xml document
 * It contains String fields:
 * name - the name of a book
 * realiseDate - book's realise date
 * category - book's category
 * Integer field:
 * pages - the number of pages in a book
 * List:
 * author - the list of book's authors
 */
@XmlType(propOrder = {"name", "category", "pages", "realiseDate", "author"})
public class Book {
    private String name;
    private String realiseDate;
    private int pages;
    private String category;
    private List<Author> author = new ArrayList<>();

    /**
     * Default constructor which does not take any parameters
     */
    public Book(){}

    /**
     * Constructor which takes parameters and assigns it to class fields
     * @param name          the name of a book
     * @param realiseDate   book's realise date
     * @param pages         number of pages in a book
     * @param category      book's category
     */
    public Book(String name, String realiseDate, int pages, String category){
        this.name = name;
        this.pages = pages;
        this.realiseDate = realiseDate;
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @XmlElementWrapper(name = "authors")
    public List<Author> getAuthor() {
        return author;
    }
    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getRealiseDate() {
        return realiseDate;
    }
    public void setRealiseDate(String realiseDate) {
        this.realiseDate = realiseDate;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * takes Author object as a parameter and adds it to author list
     * by getting list and using add() function
     * @param author  whatever Author object is passed will be added in a list
     */
    public void addAuthor(Author author) {
        this.getAuthor().add(author);
    }

    /**
     * Each Author object is added in string variable.
     * @return finalResult all Author objects in String format
     */
    private String printAuthor(){
        String finalResult = "";
        for(Author author : getAuthor()){
            finalResult += author;
        }
        return finalResult;
    }

    @Override
    public String toString() {
        return String.format(
                "\n\t\t\tbook: " +
                "\n\t\t\t\tname: %s " +
                "\n\t\t\t\tcategory: %s " +
                "\n\t\t\t\trealise date: %s " +
                "\n\t\t\t\tpages: %d" +
                "\n\t\t\t\tAuthors: %s", getName(), getCategory(), getRealiseDate(), getPages(), printAuthor());
    }

}
