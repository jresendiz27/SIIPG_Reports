package mx.ipn.siipg.reports

class Content {
    String title
    String html

    Date dateCreated
    Date lastUpdated

    static mapping = {
        autoTimestamp true
        html sqlType: "TEXT"
    }

    static constraints = {
        html nullable: false, blank: false, maxSize: 20000
    }
}
