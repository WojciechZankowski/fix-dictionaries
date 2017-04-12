package pl.zankowski.fix.orchestra;

import io.fixprotocol.orchestra.transformers.RepositoryXslTransformer;

import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;

/**
 * @author Wojciech Zankowski
 */
public class FixRepositoryConverter {

    public static void main(String[] args) throws TransformerException, IOException {
        File inputFile = new File(args[0]);
        String[] arr = new String[3];
        arr[0] = FixRepositoryConverter.class.getClassLoader().getResource("xsl/Repository2010to2016.xsl").getFile();
        arr[1] = inputFile.getAbsolutePath();
        arr[2] = inputFile.getParentFile().getAbsolutePath().concat("/output.xml");
        for (String each : arr) {
            System.out.println(each);
        }
        RepositoryXslTransformer.main(arr);
    }

}
