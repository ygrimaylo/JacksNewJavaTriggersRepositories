package com.codiscope.jaks.triggers.java.spring.jdbc.jdotemplate;

import org.springframework.orm.jdo.JdoTemplate;

import tests.sources.DatabaseSource;
import tests.sources.FileSource;
import tests.sources.PrivateSource;
import tests.sources.WebSource;
import tests.sources.WebSourceCookie;

/**
 * The Class JdoTemplateSqliFind
 */
public class JdoTemplateSqliFind {

    private DatabaseSource databasesource = new DatabaseSource();
    private FileSource filesource = new FileSource();
    private PrivateSource privatesource = new PrivateSource();
    private WebSource websource = new WebSource();
    private WebSourceCookie webcookie = new WebSourceCookie();

    private JdoTemplate template;

    public JdoTemplateSqliFind() {
        this.template = new JdoTemplate();
    }

    public void testfind() {

        //Collection find(Class entityClass)

        template.find(databasesource.method1());

        //Collection find(Class entityClass,String filter)
        template.find(DatabaseSource.class, websource.method2());


        //Collection find(Class entityClass, String filter, String ordering)
        template.find(DatabaseSource.class, null, websource.method2());
        //above statement is fine, engine should not give any error on this.
    }
}
