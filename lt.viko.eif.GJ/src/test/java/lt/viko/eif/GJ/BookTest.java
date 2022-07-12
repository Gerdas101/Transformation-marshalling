package lt.viko.eif.GJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book();
        System.out.println("Running setUp()");
    }

    @Test
    void getName() {
        book.setName("Heris_Poteris");
        assertNotNull(book);
        assertEquals("Heris_Poteris", book.getName());
        assertTrue(book.toString().contains("Heris_Poteris"));
    }

    @Test
    void setName() {
        book.setName("Heris_Poteris");
        assertNotNull(book);
        assertEquals("Heris_Poteris", book.getName());
    }

    @Test
    void getAuthor() {
        Author author = new Author("Jonas", "Jonaitis");
        Author author1 = new Author("Petras", "Petraitis");

        List <Author> authorList = new ArrayList<>();
        authorList.add(author1);
        authorList.add(author);

        book.getAuthor().add(author);
        book.getAuthor().add(author1);

        assertEquals(authorList, book.getAuthor());
        assertEquals(2, book.getAuthor().size());
    }

    @Test
    void setAuthor() {
        Author author = new Author("Jonas", "Jonaitis");
        Author author1 = new Author("Petras", "Petraitis");
        List <Author> authorList = new ArrayList<>();
        authorList.add(author1);
        authorList.add(author);

        book.setAuthor(authorList);

        assertEquals(authorList, book.getAuthor());
        assertEquals(2, book.getAuthor().size());
    }

    @Test
    void getRealiseDate() {
        book.setRealiseDate("2000/02/02");
        assertNotNull(book);
        assertEquals("2000/02/02", book.getRealiseDate());
        assertTrue(book.toString().contains("2000/02/02"));
    }

    @Test
    void setRealiseDate() {
        book.setRealiseDate("2000/02/02");
        assertNotNull(book);
        assertEquals("2000/02/02", book.getRealiseDate());
    }

    @Test
    void getPages() {
        book.setPages(200);
        assertNotNull(book);
        assertEquals(200, book.getPages());
        assertTrue(book.toString().contains("200"));
    }

    @Test
    void setPages() {
        book.setPages(200);
        assertNotNull(book);
        assertEquals(200, book.getPages());
    }

    @Test
    void getCategory() {
        book.setCategory("Sci-fi");
        assertNotNull(book);
        assertEquals("Sci-fi", book.getCategory());
        assertTrue(book.toString().contains("Sci-fi"));
    }

    @Test
    void setCategory() {
        book.setCategory("Sci-fi");
        assertNotNull(book);
        assertEquals("Sci-fi", book.getCategory());
    }

    @Test
    void addAuthor() {
        Author author = new Author("Jonas", "Jonaitis");
        Author author1 = new Author("Petras", "Petraitis");

        List <Author> authorList = new ArrayList<>();
        authorList.add(author1);
        authorList.add(author);

        book.addAuthor(author);
        book.addAuthor(author1);

        assertEquals(authorList, book.getAuthor());
        assertEquals(2, book.getAuthor().size());

    }
}