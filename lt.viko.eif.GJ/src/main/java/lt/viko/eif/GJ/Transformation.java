package lt.viko.eif.GJ;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;

/**
 * Class which performs transformations from/to xml document
 */
public class Transformation {

    JAXBContext jaxbContext = null;

    /**
     * This method takes an object, creates JAXBContext and JAXBMarshaller of that object
     * and transforms it to xml document.
     * @param obj   for creating JAXBContext and JAXBMarshaller of given object
     * @param file  name of a file to write xml document to
     */
    public void ObjToXml(Object obj, String file){
        try{
            jaxbContext = JAXBContext.newInstance(obj.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(obj, new File(file));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method takes an object, creates JAXBContext and JAXBMarshaller of that object
     * and returns an object which is transformed from xml document
     * @param clazz           for creating JAXBContext and JAXBMarshaller of given object
     * @param file            takes a path of a xml document
     * @return                returns an object which is transformed from xml document
     * @throws JAXBException  throws an JAXBException if an error occurs
     */
    public Object XmlToObj(Class clazz, String file) throws JAXBException {
        Object obj = null;
        try {
            jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            obj = (Object) jaxbUnmarshaller.unmarshal(new File(file));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return obj;
    }
    public void XmlToHtml() throws FileNotFoundException, TransformerException {
        TransformerFactory tFactory=TransformerFactory.newInstance();

        Source xslDoc=new StreamSource("C:\\Users\\gerda\\IdeaProjects\\lt.viko.eif.GJ\\libraryXSL.xsl");
        Source xmlDoc=new StreamSource("C:\\Users\\gerda\\IdeaProjects\\lt.viko.eif.GJ\\library.xml");

        String outputFileName="libraryHtml.html";

        OutputStream htmlFile=new FileOutputStream(outputFileName);
        Transformer transform=tFactory.newTransformer(xslDoc);
        transform.transform(xmlDoc, new StreamResult(htmlFile));
    }

}
