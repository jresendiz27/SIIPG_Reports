package mx.ipn.siipg.reports

class LoginController {

    def index() {
        log.error "Inside Login controller"
        render(view: "index")
    }
}
