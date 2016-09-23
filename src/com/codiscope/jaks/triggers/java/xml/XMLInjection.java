package com.codiscope.jaks.triggers.java.xml;
 
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class XMLInjection {

	public void test() throws ParserConfigurationException, SAXException, IOException {
		
		//DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentFactory docBuilderFactory = DocumentFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	}
}

