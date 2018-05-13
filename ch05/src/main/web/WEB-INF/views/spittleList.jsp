<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css" />">
</head>
<body>
<div class="spittleForm">
    <h1>Spit it out...</h1>
    <form method="POST" name="spittleForm">
        <input type="hidden" name="latitude">
        <input type="hidden" name="longitude">
        <textarea name="message" cols="80" rows="5"></textarea><br/>
        <input type="submit" value="Add"/>
    </form>
</div>
<div class="listTitle">
    <h1>Recent Spittles</h1>
    <ul class="spittleList">
        <c:forEach items="${pagination.datas}" var="spittle">
            <li id="spittle_<c:out value="spittle.id"/>">
                <div class="spittleMessage"><c:out value="${spittle.message}"/></div>
                <div>
                    <span class="spittleTime"><c:out value="${spittle.gmtCreate}"/></span>
                    <span class="spittleLocation">(<c:out value="${spittle.latitude}"/>, <c:out
                            value="${spittle.longitude}"/>)</span>
                </div>
            </li>
        </c:forEach>
    </ul>
    <c:if test="${pagination.total gt pagination.currentPage * 10}">
        <hr/>
        <s:url value="/spittle/list?pageNum=${pagination.currentPage + 1}" var="more_url"/>
        <a href="${more_url}">Show more</a>
    </c:if>
</div>
</body>
</html>