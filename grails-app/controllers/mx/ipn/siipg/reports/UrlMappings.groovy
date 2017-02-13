package mx.ipn.siipg.reports

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'content', action: 'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
