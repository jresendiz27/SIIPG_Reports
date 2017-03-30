package mx.ipn.siipg.reports.util
/**
 * Created by jresendiz on 19/03/17.
 */
class StringUtil {
    static String sanitize(String string) {
        String sanitizedString = string
        sanitizedString = sanitizedString.trim()
        sanitizedString = sanitizedString.replaceAll(" ", "-")
        sanitizedString = sanitizedString.replaceAll("\\.+", ".")
        sanitizedString = sanitizedString.replaceAll("[\\\\|/|:|\\*|\\?|\\<|\\>|\\|]", "_")
        return sanitizedString
    }

    static String sanitizeTitle(String  string) {
        String sanitizedString = string
        sanitizedString = sanitizedString.trim()
        sanitizedString = sanitizedString.replaceAll("\\.", "%")
        return sanitizedString
    }
}
