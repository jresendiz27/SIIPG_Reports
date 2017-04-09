package mx.ipn.siipg.reports

import grails.util.Environment
import groovy.sql.Sql

class BootStrap {

    def dataSource

    def init = { servletContext ->
        //if(Environment.current == Environment.PRODUCTION) {
            //def resource = this.class.classLoader.getResource('inserts.sql')
            //def file = resource.getFile();
            //Sql connection =  new Sql(dataSource)
            //connection.execute(new File(file).text);
        //}
    }
    def destroy = {
    }
}
