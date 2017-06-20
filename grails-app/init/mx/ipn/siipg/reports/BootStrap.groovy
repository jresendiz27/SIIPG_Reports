package mx.ipn.siipg.reports

import grails.util.Environment
import groovy.sql.Sql

class BootStrap {

    def dataSource

    def init = { servletContext ->
        if(Environment.current == Environment.PRODUCTION) {
            def resource = this.class.classLoader.getResourceAsStream('public/inserts.sql')
            def file = resource.text;
            Sql connection =  new Sql(dataSource)
            connection.execute(file);
        }
    }
    def destroy = {
    }
}
