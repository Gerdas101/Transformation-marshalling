package lt.viko.eif.GJ;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is a root element which contains a list of Library objects.
 */
@XmlRootElement
public class Libraries {
    private List<Library> library = new ArrayList<>();

    public List<Library> getLibrary() {
        return library;
    }
    public void setLibrary(List<Library> library) {
        this.library = library;
    }

    /**
     * takes Library object as a parameter and adds it to library list
     * by getting list and using add() function
     * @param library  whatever Library object is passed will be added in a list
     */
    public void addLibrary(Library library) {
        this.getLibrary().add(library);
    }

    @Override
    public String toString(){
        return String.format("Libraries: \t%s", printLibrary());
    }

    /**
     * Each Library object is added in string variable.
     * @return finalResult all Library objects in String format
     */
    private String printLibrary(){
        String finalResult = "";
        for(Library lib : getLibrary()){
            finalResult += lib;
        }
        return finalResult;
    }
}
