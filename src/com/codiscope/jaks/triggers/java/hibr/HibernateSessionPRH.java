package com.codiscope.jaks.triggers.java.hibr;
 
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 Rule:
 <Rule id="CIGITAL-JAVA-HIBERNATE-PRH" lang="java">
 <Category>Hibernate Security</Category>
 <Title>Session not closed in finally block</Title>
 <Description>
 Checks that a session was closed in a finally block and not
 the try or catch block.
 </Description>
 <Match block="finally">
 <QualifiedName>org.hibernate.Session\b</QualifiedName>
 <Method>close</Method>
 </Match>
 <Standards>
 <Standard file="resource-handling.xml">
 <Context>Hibernate</Context>
 </Standard>
 </Standards>
 </Rule>
 */
public class HibernateSessionPRH {
	HttpServletRequest request = null;

	public void test() {
		Session session = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			session.close();
		} finally {
			session.close();
		}
	}
}
