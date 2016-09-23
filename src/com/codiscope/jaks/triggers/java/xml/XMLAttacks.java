package com.codiscope.jaks.triggers.java.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.crimson.jaxp.DocumentBuilderImpl;
import org.apache.crimson.parser.Parser2;
import org.apache.crimson.parser.XMLReaderImpl;
import org.apache.xerces.parsers.XMLParser;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/*
 Rule:
 <Rule id="CIGITAL-JAVA-XML-DTD" lang="java">
 <Category>XML attacks</Category>
 <Title>XML DTD Attack</Title>
 <Description>Identifies code where XML parsers allow DTDs. Resolving Entities within DTDs allows long iterations of entities calling other entities, which may cause XML parser to overload and deny the service.</Description>
 <Match>
 <QualifiedName>javax.xml.parsers.DocumentBuilder|javax.xml.parsers.SAXParser|org.xml.sax.XMLReader|org.apache.xerces.parsers.XMLParser|org.apache.crimson.parser.XMLReaderImpl|org.apache.crimson.jaxp.DocumentBuilderImpl|org.apache.crimson.parser.Parser2</QualifiedName>
 <Method>parse</Method>
 </Match>
 <Standards>
 <Standard file="xml-dtd-attack.xml">
 <Context>J2EE</Context>
 </Standard>
 </Standards>
 </Rule>
 */
@SuppressWarnings("deprecation")
public class XMLAttacks {

	@SuppressWarnings("null")
	public void test() throws ParserConfigurationException, SAXException,
			IOException {

		DocumentBuilderFactory docBuilderFactory = null;

		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

		docBuilder.parse("URI");
	}

	public void test2() throws ParserConfigurationException, SAXException,
			IOException {

		// parse
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			HandlerBase dh = null;
			parser.parse("URI", dh);
		} catch (ParserConfigurationException e) {
			System.out.println("ParserConfig error");
		} catch (SAXException e) {
			System.out.println("SAXException : xml not well formed");
		} catch (IOException e) {
			System.out.println("IO error");
		}
	}

	@SuppressWarnings("null")
	public void test3() throws ParserConfigurationException, SAXException,
			IOException {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		spf.setValidating(false);

		XMLReader reader = null;
		reader.parse("");
	}

	@SuppressWarnings("null")
	public void test4() throws ParserConfigurationException, SAXException,
			IOException {
		XMLInputSource s = null;
		XMLParser xmlp = null;
		xmlp.parse(s);
	}

	public void test5() throws ParserConfigurationException, SAXException,
			IOException {
		String input = null;

		XMLReaderImpl xml = new XMLReaderImpl();
		xml.parse(input);
	}

	@SuppressWarnings("null")
	public void test6() throws ParserConfigurationException, SAXException,
			IOException {
		DocumentBuilderImpl doc = null;
		doc.parse(new File("abc.xml"));
	}

	public void test7() throws ParserConfigurationException, SAXException,
			IOException {
		InputSource in = null;
		
		Parser2 par = new Parser2();
		par.parse(in );
	}
}
