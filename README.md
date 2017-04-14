# FIX Dictionaries - QuickFIX

## Table of Contents

* [Summary](#summary)
* [Code Generation](#code-generation)
* [License](#license)

## Summary

## Code Generation

### QuickFix/J

To generate code based on XML FIX Dictionary I recommend using maven plugin released by QuickFix/J. I did not find any useful documentation on how to use it, so quick tutorial down below.

In each POM file there is already configurated quickfixj-codegenerator plugin. To make it work just run it trough command line.   

```xml 
<build>
    <plugins>
        <plugin>
            <groupId>org.quickfixj</groupId>
            <artifactId>quickfixj-codegenerator</artifactId>
            <version>1.6.3</version>
            <configuration>
                <dictFile>${basedir}/src/main/resources/IB_FIX.xml</dictFile>
                <outputDirectory>${basedir}/src/main/java/</outputDirectory>
                <packaging>quickfix.ib</packaging>
                <fieldPackage>quickfix.ib.field</fieldPackage>
            </configuration>
        </plugin>
    </plugins>
</build>
```

Available configuration parameters:

* ```dictFile``` - The dictionary file to use for mapping messages to java.
* ```schemaDirectory``` - The source directory containing *.xsd files.
* ```outputDirectory``` - The directory to output the generated sources to.
* ```decimal``` - Enable BigDecimal representation.
* ```orderedFields``` - Enable orderedFields.
* ```packaging``` - The package for the generated source.
* ```fieldPackage``` - The base field class to use.

For more details about implementation, check out ```org.quickfixj.codegenerator.GenerateMojo``` class.


## License

Code and documentation released under the Apache License, Version 2.0
