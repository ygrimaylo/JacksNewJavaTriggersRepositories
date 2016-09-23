package com.codiscope.jaks.triggers.java.xslt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import tests.sources.PrivateSource;

/**
 * A malicious XSLT could be provided
 * GUID-660
 * Created by ronn on 23.08.16.
 */
public class XSLTSourceValidation {

    private PrivateSource privateSource = new PrivateSource();

    public void positiveTest1() throws FileNotFoundException, TransformerException {

        final Source xslt = new StreamSource(new FileInputStream(privateSource.method1()));
        final Source text = new StreamSource(new FileInputStream("/data_2_process.xml"));

        final TransformerFactory transformerFactory = TransformerFactory.newInstance();
        final Transformer transformer = transformerFactory.newTransformer(xslt);

        transformer.transform(text, new StreamResult(new FileOutputStream("./file_out1")));
    }

    public void positiveTest2() throws FileNotFoundException, TransformerException {

        final Source xslt = getStreamSource();
        final Source text = new StreamSource(new FileInputStream("/data_2_process.xml"));

        final TransformerFactory transformerFactory = TransformerFactory.newInstance();
        final Transformer transformer = transformerFactory.newTransformer(xslt);

        transformer.transform(text, new StreamResult(new FileOutputStream("./file_out2")));
    }

    private StreamSource getStreamSource() throws FileNotFoundException {
        return new StreamSource(new FileInputStream(privateSource.method1()));
    }

    public void negativeTest() throws FileNotFoundException, TransformerException {

        final Source xslt = new StreamSource(new FileInputStream("./source.xslt"));
        final Source text = new StreamSource(new FileInputStream("/data_2_process.xml"));

        final TransformerFactory transformerFactory = TransformerFactory.newInstance();
        final Transformer transformer = transformerFactory.newTransformer(xslt);

        transformer.transform(text, new StreamResult(new FileOutputStream("./file_out3")));
    }
}
