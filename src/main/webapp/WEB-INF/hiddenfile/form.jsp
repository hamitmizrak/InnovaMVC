<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Merhabalar Form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
</head>
<body style="background-color: black;">

<div class="container bg-dark  text-white mt-5">
    <h2 class="text-danger text-center display-2">Writer Form</h2>
    <form:form method="post" modelAttribute="form_key">
        <fieldset class="form-group">
            <form:label path="id">Writer ID</form:label>
            <form:input cssClass="form-control" path="id" disabled="false"/>
        </fieldset>

        <fieldset class="form-group">
            <form:input cssClass="form-control" path="writerName"/>
        </fieldset>

        <fieldset class="form-group">
            <form:input cssClass="form-control" path="writerSurname"/>
            <form:errors path="writerSurname"/>
        </fieldset>

        <fieldset class="form-group">
            <form:input cssClass="form-control" path="writerAddress"/>
        </fieldset>

        <fieldset class="form-group">
            <form:input cssClass="form-control" path="writerTelephoneNumber"/>
        </fieldset>

        <input type="reset" class="btn btn-danger mb-5" value="Temizle"/>
        <input type="submit" class="btn btn-primary mb-5" value="Gönder"/>
    </form:form>
</div>
<br><br><br><br>


<%--ends codes--%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"/>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"/>
</body>
</html>