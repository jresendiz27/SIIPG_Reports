package mx.ipn.siipg.reports.util
/**
 * Created by jresendiz on 19/03/17.
 */
class StringUtil {
    static String sanitize(String string) {
        String sanitizedString = string.clone()
        sanitizedString = sanitizedString.replaceAll(" ", "_")
        sanitizedString = sanitizedString.replaceAll("\"", "_")
        sanitizedString = sanitizedString.replaceAll("\"", "_")
        sanitizedString = sanitizedString.replaceAll("/", "_")
        sanitizedString = sanitizedString.replaceAll(":", "_")
        sanitizedString = sanitizedString.replaceAll("\\*", "_")
        sanitizedString = sanitizedString.replaceAll("\\?", "_")
        sanitizedString = sanitizedString.replaceAll("\\<", "_")
        sanitizedString = sanitizedString.replaceAll("\\>", "_")
        sanitizedString = sanitizedString.replaceAll("\\|", "_")
        return sanitizedString.toString()
    }
}
