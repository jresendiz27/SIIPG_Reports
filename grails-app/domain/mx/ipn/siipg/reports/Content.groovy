package mx.ipn.siipg.reports

class Content {
    String title
    String html

    static mapping = {
        html sqlType: "TEXT"
    }

    static constraints = {
        html nullable: false, blank: false, maxSize: 20000
    }
}
