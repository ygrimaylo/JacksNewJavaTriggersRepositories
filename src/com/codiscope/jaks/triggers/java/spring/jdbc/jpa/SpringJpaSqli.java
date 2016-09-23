package com.codiscope.jaks.triggers.java.spring.jdbc.jpa;

import org.springframework.orm.jpa.JpaTemplate;

import java.util.Map;

import tests.sources.DatabaseSource;
import tests.sources.FileSource;
import tests.sources.PrivateSource;
import tests.sources.WebSource;
import tests.sources.WebSourceCookie;

/**
 * The Class SpringJpaSqli
 */
public class SpringJpaSqli {

    DatabaseSource databasesource = new DatabaseSource();
    FileSource filesource = new FileSource();
    PrivateSource privatesource = new PrivateSource();
    WebSource websource = new WebSource();
    WebSourceCookie webcookie = new WebSourceCookie();

    private JpaTemplate template;

    public SpringJpaSqli() {
        this.template = new JpaTemplate();
    }

    public void testFind() {
        Object value = null;
        Object[] value1 = null;
        Map<String, ?> params = null;

        //find(String queryString
        template.find(databasesource.method1());

        //find(String queryString, Object value)
        template.find(websource.method2(), value);

        //find(String queryString, Object[] values)
        template.find(websource.method2(), value1);

        //findByNamedParams(String queryString, Map<String,? extends Object> params)
        template.findByNamedParams(websource.method2(), params);
    }

    public void testFindByNamedQuery() {

        Object value = null;
        Map<String, ?> params = null;

        //findByNamedQuery(String queryName)
        template.findByNamedQuery(databasesource.method1());

        //findByNamedQuery(String queryName, Object... values)
        template.findByNamedQuery(databasesource.method1(), value);

        //findByNamedQueryAndNamedParams(String queryName, Map<String,? extends Object> params)
        template.findByNamedQueryAndNamedParams(databasesource.method1(), params);
    }
}
