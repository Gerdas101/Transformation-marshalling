package lt.viko.eif.GJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    private Author author;

    @BeforeEach
    void setUp() {
        author = new Author();
        System.out.println("Running setUp()");
    }

    @Test
    void getName() {
        author.setName("Jonas");
        assertNotNull(author);
        assertEquals("Jonas", author.getName());
        assertTrue(author.toString().contains("Jonas"));
    }

    @Test
    void setName() {
        author.setName("Jonas");
        assertNotNull(author);
        assertEquals("Jonas", author.getName());
    }

    @Test
    void getSurname() {
        author.setSurname("Jonaitis");
        assertNotNull(author);
        assertEquals("Jonaitis", author.getSurname());
        assertTrue(author.toString().contains("Jonaitis"));
    }

    @Test
    void setSurname() {
        author.setSurname("Jonaitis");
        assertNotNull(author);
        assertEquals("Jonaitis", author.getSurname());
    }
}