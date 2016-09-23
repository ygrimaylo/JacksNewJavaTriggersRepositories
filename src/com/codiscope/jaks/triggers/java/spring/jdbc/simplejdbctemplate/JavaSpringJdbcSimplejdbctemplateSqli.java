package com.codiscope.jaks.triggers.java.spring.jdbc.simplejdbctemplate;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import javax.sql.DataSource;

import tests.sources.DatabaseSource;
import tests.sources.FileSource;
import tests.sources.PrivateSource;
import tests.sources.WebSource;
import tests.sources.WebSourceCookie;

/**
 * The Class JavaSpringJdbcSimplejdbctemplateSqli
 */
public class JavaSpringJdbcSimplejdbctemplateSqli {

    private WebSourceCookie webcookie = new WebSourceCookie();
    private DatabaseSource databasesource = new DatabaseSource();
    private FileSource filesource = new FileSource();
    private PrivateSource privatesource = new PrivateSource();
    private WebSource websource = new WebSource();

    private SimpleJdbcTemplate template;

    public JavaSpringJdbcSimplejdbctemplateSqli(DataSource dataSource) {
        this.template = new SimpleJdbcTemplate(dataSource);
    }

    public void testQuery() {

        String query = "SELECT COF_NAME FROM COFFEES WHERE ID=" + websource.method2();

        //Test SimpleJdbcOperations query
        template.query(query, null);

        //Test SimpleJdbcOperations queryForList
        template.queryForList(query);

        //Test SimpleJdbcOperations queryForInt
        template.queryForInt(query);

        //Test SimpleJdbcOperations queryForLong
        template.queryForLong(query);

        //Test SimpleJdbcOperations queryForMap
        template.queryForMap(query);

        //Test SimpleJdbcOperations queryForObject
        template.queryForObject(query, String.class);
    }

    //Test SimpleJdbcOperations Update
    public void testUpdate() {
        template.update(databasesource.method1());
    }

    //Test SimpleJdbcOperations batchUpdate & Execute
    public void testBatchUpdate() {
        template.getJdbcOperations().batchUpdate(new String[]{websource.method2()});

        //Test SimpleJdbcOperations execute
        template.getJdbcOperations().execute(websource.method2());
    }
}
