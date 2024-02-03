<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="admin" />
        <meta name="admin.active.section" content="admin.tabs.blog"/>
        <meta name="admin.active.item" content="posts"/>
        <g:set var="entityName" value="${message(code: 'post.label', default: 'Post')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
    <div id="content" role="main">
        <div class="container">
            <section class="row">
                <a href="#list-post" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
                <div class="col-12" role="navigation">
                    <ul class="nav nav-pills">
                        <li class="nav-item">
                            <a class="nav-link" href="${createLink(uri: '/')}">
                                <i class="bi bi-house-fill"></i><g:message code="default.home.label"/>
                            </a>
                        </li>
                        <li class="nav-item">
                            <g:link class="nav-link" action="create">
                                <i class="bi bi-journal-plus"></i><g:message code="default.new.label" args="[entityName]" />
                            </g:link>
                        </li>
                    </ul>
                </div>
            </section>
            <section class="row">
                <div id="list-post" class="col-12 scaffold scaffold-list" role="main">
                    <h1><g:message code="default.list.label" args="[entityName]" /></h1>
                    <g:if test="${flash.message}">
                        <div class="alert alert-success" role="status"><i class="bi bi-info-circle"></i>${flash.message}</div>
                    </g:if>
                    <f:table collection="${postList}" />

                    <g:if test="${postCount > params.int('max')}">
                    <nav aria-label="Page navigation">
                        <bs:paginate total="${postCount ?: 0}" useIcons="true" align="center" />
                    </nav>
                    </g:if>
                </div>
            </section>
        </div>
    </div>
    </body>
</html>