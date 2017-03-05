package mx.ipn.siipg.interceptors

import mx.ipn.siipg.reports.Usuario


class SessionInterceptor {

    public SessionInterceptor() {
        match(controller:"content")
    }

    boolean before() {
        log.error " BEFORE THE METHOD "
        if (session.getAttribute("user") == null) {
            redirect(controller: "login", action: "index")
        }
        return true
    }

    boolean after() {
        log.error "AFTER THE METHOD"
        return true
    }

    void afterView() {
        // no-op
    }
}
