package com.codiscope.jaks.triggers.java.spring.mail;

import org.springframework.mail.SimpleMailMessage;

import tests.sources.DatabaseSource;
import tests.sources.FileSource;
import tests.sources.PrivateSource;
import tests.sources.WebSource;
import tests.sources.WebSourceCookie;

/**
 * The Class SpringMailForging
 */
public class SpringMailForging {

    private DatabaseSource databasesource = new DatabaseSource();
    private FileSource filesource = new FileSource();
    private PrivateSource privatesource = new PrivateSource();
    private WebSource websource = new WebSource();
    private WebSourceCookie webcookie = new WebSourceCookie();

    public void testSpringSimpleMailMesssage() {
        //Test SimpleMailMesssage when source websource
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject(websource.method2());

        //Test SimpleMailMesssage when source DatabaseSource
        mailMessage.setFrom(databasesource.method2());
        mailMessage.setCc(databasesource.method1());

        //Test SimpleMailMesssage when source WebCookie
        mailMessage.setBcc(webcookie.method5());

        //Test SimpleMailMesssage when source FileDource
        mailMessage.setText(filesource.method1());

        //Test SimpleMailMesssage when source PrivateDource
        mailMessage.setText(privatesource.method1());
    }
}
