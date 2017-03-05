<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'content.label', default: 'Content')}" />
    <title>Login</title>
</head>
<body>
<a href="#list-content" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
    </ul>
</div>
<div id="list-content" class="content scaffold-list" role="main">
    <g:if test="${session.getAttribute("user") == null }">
        <h1>
            LOGIN
        </h1>
    </g:if>
</div>
</body>
</html>