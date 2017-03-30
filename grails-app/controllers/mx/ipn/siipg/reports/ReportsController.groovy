package mx.ipn.siipg.reports

import mx.ipn.siipg.reports.util.StringUtil

class ReportsController {

    def chartService

    def dummyReport() {
        Content content = Content.findByTitleLike("%${params.name}%")
        response.setContentType("application/pdf")
        response.setHeader("Content-Disposition", "attachment; filename=${StringUtil.sanitize(content.title)}.pdf")
        renderPdf(template: "main", model: [content: content, image: chartService.generateBase64ImageURI(chartService.generateDummyChart())])
    }

    def generateReport() {
        Content content = Content.findByTitleLike("%${params.name}%") ?: Content.findById(params.int("id"));
        response.setContentType("application/pdf")
        response.setHeader("Content-Disposition", "attachment; filename=${StringUtil.sanitize(content.title)}.pdf")
        renderPdf(template: "main", model: [content: content, image: params.image ?: chartService.generateBase64ImageURI(chartService.genereteBarChart())])
    }
}
