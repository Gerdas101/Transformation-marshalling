package lt.viko.eif.GJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class TransformationTest {

    private Transformation transformation;
    private Libraries libraries;

    @BeforeEach
    void setUp() {
        transformation = new Transformation();
        Data data = new Data();
        libraries = data.create();
    }

    @Test
    void objToXml() throws IOException {
        transformation.ObjToXml(libraries,"C:\\Users\\gerda\\IdeaProjects\\lt.viko.eif.GJ\\src\\test\\resources\\libraryTest.xml");
        String content1 = new String ( Files.readAllBytes( Paths.get("C:\\Users\\gerda\\IdeaProjects\\lt.viko.eif.GJ\\src\\test\\resources\\libraryTest.xml") ) );
        String content2 = new String ( Files.readAllBytes( Paths.get("C:\\Users\\gerda\\IdeaProjects\\lt.viko.eif.GJ\\library.xml") ) );

        assertNotNull(content1);
        assertNotNull(content2);
        assertEquals(content1, content2);
    }

    @Test
    void xmlToObj() throws JAXBException {
        Libraries libraries1;
        libraries1 = (Libraries) transformation.XmlToObj(Libraries.class, "C:\\Users\\gerda\\IdeaProjects\\lt.viko.eif.GJ\\src\\test\\resources\\libraryTest.xml");

        assertNotNull(libraries1);
        assertEquals(libraries.toString(), libraries1.toString());
    }
}