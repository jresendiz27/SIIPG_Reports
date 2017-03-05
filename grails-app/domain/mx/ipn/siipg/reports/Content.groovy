package mx.ipn.siipg.reports

class Content {
    String title
    String html

    static constraints = {
        html nullable: false, blank: false, maxSize: 20000
    }

    static mapping = {
        table "content"
        id column: 'id'
        version false
    }
}
