package com.codiscope.jaks.triggers.java.hibr;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import tests.sources.PrivateSource;

import java.util.List;

/**
 * The class HibernateSqlI
 */
public  class HibernateSqlI {

    private PrivateSource privateSource = new PrivateSource();
    /**
     * Test which should be found by Jacks
     */
    private void  positiveTest(){

        String source = privateSource.method1();
        Session session = getSession();
        session.createFilter(source, source);
        session.delete(source);
        session.delete(source, source);
        Query query = session.createQuery(source);

        query.iterate();
        session.find(source);
    }

    /**
     * Test which shouldn't be found by Jacks
     */
    public void negativeTest(){
        Session session = getSession();
        String source = privateSource.method1();
        Query q = session.createQuery("SELECT order.name FROM Order AS order WHERE order.orderID = '" + source + "'");
        List results = q.list();

    }

    private Session getSession(){
        return null;
    }
}
