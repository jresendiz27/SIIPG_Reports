package mx.ipn.siipg.reports

class Content {
    String title
    String html

    Date dateCreated
    Date lastUpdated

    static mapping = {
        autoTimestamp true
    }

    static constraints = {
        html nullable: false, blank: false, maxSize: 20000
    }
}
