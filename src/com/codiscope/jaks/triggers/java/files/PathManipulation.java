package com.codiscope.jaks.triggers.java.files;

import java.io.File;
import java.io.IOException;
import tests.sources.DatabaseSource;
import tests.sources.FileSource;
import tests.sources.PrivateSource;
import tests.sources.WebSource;
import tests.sources.WebSourceCookie;

/*
 Rule:
 	<Rule id="CIGITAL-FILE-PATH-MANIPULATION-01" lang="java">
		<!-- IMPORTANCE: HIGH -->
		<Category>Path Manipulation</Category>
		<Title>Unsanitized data used to access a file system resource</Title>
		<Description>Identifies if untrusted data is being used to access a resource</Description>
		<Match>
			<QualifiedName><![CDATA[^java\.io\.File(InputStream|OutputStream)?$]]></QualifiedName>
			<Argument taint="WEB|DB|FILE">0</Argument>
		</Match>
		<Standards>
			<Standard file="path-manipulation.xml">
				<Context>J2EE</Context>
			</Standard>
		</Standards>
	</Rule>
 */
public class PathManipulation {
	DatabaseSource databasesource = new DatabaseSource();
	FileSource filesource = new FileSource();
	PrivateSource privatesource = new PrivateSource();
	WebSource websource = new WebSource();
	WebSourceCookie webcookie = new WebSourceCookie();
	
	ProcessBuilder pb;
	
	public void testWeb() throws IOException {
		
		File file = new File(websource.method1());
	}
	
	public void testFile() throws IOException {
		File file = new File(filesource.method1());
	}
	
	public void testDB() throws IOException {
		File file = new File(databasesource.method1());
		
		
	}
}
