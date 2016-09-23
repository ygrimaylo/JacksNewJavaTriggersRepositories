package com.codiscope.jaks.triggers.java.spring.jdbc.ibatis;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import tests.sources.DatabaseSource;
import tests.sources.FileSource;
import tests.sources.PrivateSource;
import tests.sources.WebSource;
import tests.sources.WebSourceCookie;

/**
 * The Class SpringIbatisSqli
 */
public class SpringIbatisSqli {

    DatabaseSource databasesource = new DatabaseSource();
    FileSource filesource = new FileSource();
    PrivateSource privatesource = new PrivateSource();
    WebSource websource = new WebSource();
    WebSourceCookie webcookie = new WebSourceCookie();


    private SqlMapClientTemplate template;

    public SpringIbatisSqli() {
        this.template = new SqlMapClientTemplate();
    }

    public void testQuery() {

        //Test SqlMapClientOperations queryForList
        template.queryForList(databasesource.method1(), websource.method2());

        //Test SqlMapClientOperations queryForMap
        template.queryForMap(websource.method2(), databasesource, "name");

        //Test SqlMapClientOperations queryForObject
        template.queryForObject(websource.method2(), databasesource);

        //TODO: Need to add the dependency
        //template.queryForPaginatedList(databasesource.method1(), privatesource.method1(), 10);

        //template.queryWithRowHandler(databasesource.method1(), privatesource, websource);
    }

    //Test SqlMapClientOperations update
    public void testUpdate() {
        template.update(databasesource.method1(), webcookie);

        template.update(websource.method2(), privatesource, 10);
    }

    //Test SqlMapClientOperations delete
    public void testDelete() {
        template.delete(websource.method2(), databasesource);

        template.delete(websource.method2(), databasesource, 10);
    }

    //Test SqlMapClientOperations insert
    public void testInsert() {
        template.insert(websource.method2(), databasesource);
    }
}
