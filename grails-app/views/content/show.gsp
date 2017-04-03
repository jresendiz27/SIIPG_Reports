<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'content.label', default: 'Content')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#show-content" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
                <li><g:link class="report" controller="reports" action="dummyReport" params="[id: content.id]"><g:message code="content.report.test.label" /></g:link></li>
            </ul>
        </div>
        <div id="show-content" class="content scaffold-show" role="main">
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <ol class="property-list content">
                <li class="fieldcontain">
                    <span id="title-label" class="property-label">T&iacute;tulo</span>
                    <div class="property-value" aria-labelledby="title-label">${content.title}</div>
                </li>
            </ol>
            <hr/>
            <div class="row">
                <div class="col-md-10 col-md-offset-1">
                    <span id="html-label" class="property-label">Contenido</span>
                    <br/>
                    <br/>
                </div>
            </div>

            <div class="row">
                <div class="col-md-10 col-md-offset-1">
                    <div class="property-value" aria-labelledby="html-label">
                        <p style="text-align: justify;">
                            ${raw(content.html)}
                        </p>
                    </div>
                </div>
            </div>

            <br/>
            <g:form resource="${this.content}" method="DELETE">
                <fieldset class="buttons">
                    <g:link class="edit" action="edit" resource="${this.content}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
                    <input class="delete" type="submit" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
