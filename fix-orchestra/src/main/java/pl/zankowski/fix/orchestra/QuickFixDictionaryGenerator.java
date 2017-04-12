package pl.zankowski.fix.orchestra;

import io.fixprotocol.orchestra.quickfix.DataDictionaryGenerator;

import java.io.File;

/**
 * @author Wojciech Zankowski
 */
public class QuickFixDictionaryGenerator {

    public static void main(String[] args) {
        DataDictionaryGenerator generator = new DataDictionaryGenerator();
        File inputFile = new File(args[0]);
        File outputDir = inputFile.getParentFile();
        generator.generate(inputFile, outputDir);
    }

}
