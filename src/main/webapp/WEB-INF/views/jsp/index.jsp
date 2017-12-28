<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Alarm Clock</title>

    <spring:url value="/resources/core/css/hello.css" var="coreCss"/>
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <link href="${coreCss}" rel="stylesheet"/>
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Alarm Clock</a>
        </div>
    </div>
</nav>

<div class="jumbotron">
    <div class="container">
        <h1>${title}</h1>
        <p>
            <c:if test="${not empty msg}">
                ${msg}
            </c:if>

            <c:if test="${empty msg}">
                Welcome Welcome!
            </c:if>

        </p>

        <p>
        </p>
        <p>
            <form action="index.jsp" method = "GET">

            </form>
        </p>
        <iframe src="http://free.timeanddate.com/clock/i61ke3zl/n202/szw210/szh210/hoc09f/hfc09f/cf100/hnce1ead6/fan3/fas14/fdi76/mqc000/mql15/mqw4/mqd98/mhc000/mhl15/mhw4/mhd98/mmc000/mml10/mmw1/mmd98/hhs2/hms2/hsv0"
                frameborder="0" width="210" height="210"></iframe>
        <p></p><p></p>
        <a class="btn btn-primary btn-lg" href="#" role="button">Set Alarm</a>
        <p></p>

        <form action="#" th:action="@{/}" th:object="${AlarmClock}" method="post">
            <p>Hour: <input type="text" th:field="*{id}" /></p>
            <p>Minute: <input type="text" th:th:field="*{content}" /></p>
            <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
        </form>
    </div>


</div>

<hr>
<footer>
    <p></p>
</footer>
</div>

<spring:url value="/resources/core/css/hello.js" var="coreJs"/>
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs"/>

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>