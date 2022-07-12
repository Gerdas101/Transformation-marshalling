package lt.viko.eif.GJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        System.out.println("Running setUp()");
    }

    @Test
    void getName() {
        library.setName("library_name");
        assertNotNull(library);
        assertEquals("library_name", library.getName());
        assertTrue(library.toString().contains("library_name"));
    }

    @Test
    void setName() {
        library.setName("Geras");
        assertNotNull(library);
        assertEquals("Geras", library.getName());
    }

    @Test
    void getCity() {
        library.setName("library_city");
        assertNotNull(library);
        assertEquals("library_city", library.getName());
        assertTrue(library.toString().contains("librarycity"));
    }

    @Test
    void setCity() {
        library.setName("CITY");
        assertNotNull(library);
        assertEquals("CITY", library.getName());
    }

    @Test
    void getBook() {
        assertNotNull(library.getBook());
    }

    @Test
    void setBook() {
        Book book1 = new Book("Isradimai", "1995/11/11", 200, "Moksline");
        List <Book> books = new ArrayList<>();
        books.add(book1);
        library.setBook(books);

        assertEquals(books, library.getBook());
        assertTrue(library.getBook().size() > 0);
    }

    @Test
    void getAddress() {
        library.setName("library_address");
        assertNotNull(library);
        assertEquals("library_city", library.getName());
        assertTrue(library.toString().contains("librarycity"));
    }

    @Test
    void setAddress() {
        library.setAddress("library_address");
        assertNotNull(library);
        assertEquals("library_adderss", library.getAddress());
    }

    @Test
    void getEmployee() {
        assertNotNull(library.getEmployee());
    }

    @Test
    void setEmployee() {
        Employee employee = new Employee("Jonas", "Jonaitis", "Male", 30);
        List <Employee> employees = new ArrayList<>();
        employees.add(employee);

        library.setEmployee(employees);
        assertEquals(employees, library.getEmployee());
        assertTrue(library.getEmployee().size() > 0);
    }
}