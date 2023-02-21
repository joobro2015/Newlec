<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var = "size" value ="1000"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
      <a href="/input?p=14&q=hello&s=15">1</a><br>
      <a href="/input?p=17&q=hello&s=19">2</a><br>
      <a href="/input?p=18&q=hello&s=20">3</a><br>
      
      
      <div>
      	page : ${page }, query : ${query }, size : ${requestScope.size }<br>
      	param size : ${param.s }<br>
      	header : ${header["User-Agent"] }
      	hb length : ${cnt }
      </div>
      
      <form action="/input" method="post">
      
      <fieldset>
      	<legend>쿼리 값</legend>
      	<label>page:</label>
         <input type="text" name="p"><br>
         <label>검색어 1:</label>
         <input type="text" name="q1"><br>
         <label>검색어 2:</label>
         <input type="text" name="q2"><br>
         <label>검색어 3:</label>
         <input type="text" name="q3"><br>
         <label>size:</label>
         <input type="text" name="s"><br>
         </fieldset>
         
         <fieldset>
         	<legend>취미</legend>
         	<input type = "checkbox" name="hb" value="1">
         		<label>탁구</label>
         	<input type = "checkbox"name="hb" value="2">
         		<label>축구</label>
         	<input type = "checkbox"name="hb" value="3">
         		<label>독서</label>
         </fieldset>
         
         <input type="submit" value="제출">
      </form>
</body>
</html>