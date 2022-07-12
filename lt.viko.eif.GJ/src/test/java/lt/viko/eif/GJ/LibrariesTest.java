package lt.viko.eif.GJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibrariesTest {

    Libraries libraries;

    @BeforeEach
    void setUp() {
        libraries = new Libraries();
        System.out.println("Running setUp()");
    }

    @Test
    void getLibrary() {
        assertNotNull(libraries.getLibrary());
    }

    @Test
    void setLibrary() {
        Library library = new Library();
        Library library1 = new Library();
        List <Library> librariesList = new ArrayList<>();
        librariesList.add(library);
        librariesList.add(library1);
        libraries.setLibrary(librariesList);

        assertEquals(2, libraries.getLibrary().size());
    }

    @Test
    void addLibrary() {
        Library library = new Library();
        libraries.addLibrary(library);
        libraries.addLibrary(library);

        assertEquals(2, libraries.getLibrary().size());
    }
}