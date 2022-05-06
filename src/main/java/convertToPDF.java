import org.apache.fop.apps.*;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class convertToPDF {
    public static void main(String[] args)
    {
    try {
        convertToPDF();
    }
    catch (FOPException | IOException | TransformerException e)
    {
     e.printStackTrace();
    }
    }

public static void convertToPDF() throws IOException, FOPException, TransformerException {
        File xsltFile = new File("C:\\Users\\TB24961\\IdeaProjects\\toPdf\\.idea\\zaidejas.xsl");
        StreamSource xmlSource = new StreamSource(new File("C:\\Users\\TB24961\\IdeaProjects\\toPdf\\.idea\\Zaidejas.xml"));
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();

        OutputStream out;
        out = new java.io.FileOutputStream("zaidejas2022.pdf");

        try {
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));
            Result res = new SAXResult(fop.getDefaultHandler());

            transformer.transform(xmlSource, res);
            }
        finally {
            out.close();
        }
}
}
