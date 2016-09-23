package com.codiscope.jaks.triggers.java.json;

import java.sql.SQLException;
import tests.sources.PrivateSource;
import com.metaparadigm.jsonrpc.JSONRPCBridge;

/*
 Rule:
 <Rule id="CIGITAL-JAVA-JSONRPC" lang="java">
		<Category>JSONRPC Security</Category>
		<Title>Exposure of authentication objects</Title>
		<Description>Exposure of authentication objects in untrusted code may leave the information vulnerable</Description>
		<Match>
			<QualifiedName>com.metaparadigm.jsonrpc.JSONRPCBridge</QualifiedName>
			<Method>registerObject</Method>
			<Argument taint="PRIVATE">1</Argument>
		</Match>
		<Standards>
			<Standard file="java-jsonrpc-dont-pass-authentication.xml">
				<Context>J2EE</Context>
			</Standard>
		</Standards>
	</Rule>
 */
public class  JsonRpc{
	PrivateSource privatesource = new PrivateSource();
	
	public void test(int accountID) throws SQLException {
		JSONRPCBridge jsonrpc = new JSONRPCBridge();
		jsonrpc.registerObject("testService",  privatesource.method1());
	}
}
