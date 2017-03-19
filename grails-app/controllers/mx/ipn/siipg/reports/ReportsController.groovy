package mx.ipn.siipg.reports

class ReportsController {

    def chartService

    def index() { }

    def dummyReport() {
        Content content = Content.findById(params.int("id"));
        response.setContentType("application/pdf")
        response.setHeader("Content-Disposition", "attachment; filename=${content.title}.pdf")
        renderPdf(template: "main", model : [content: content, image: params.image ?: chartService.generateBase64ImageURI(chartService.generateDummyChart())])
    }

    def test() {
        response.setContentType("application/pdf")
        response.setHeader("Content-Disposition", "attachment; filename=fileName.pdf")
        renderPdf(template: "main", model : [content: Content.first(), image: chartService.generateBase64ImageURI(chartService.genereteBarChart())])
    }
}
