package lt.viko.eif.GJ;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String args[]) throws JAXBException, FileNotFoundException, TransformerException {

        Data data = new Data();
        Libraries libraries = data.create();

        Transformation transformation = new Transformation();
        transformation.ObjToXml(libraries, "library.xml");

        /*Libraries libraries2;
        libraries2 = (Libraries) transformation.XmlToObj(Libraries.class, "library.xml");
        System.out.println(libraries2);

        transformation.XmlToHtml();*/
    }
}
