<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="diary.core.entity.Diary,diary.core.service.DiaryService"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = "首页名称";
		String content = "首页内容";
		DiaryService diaryService = new DiaryService();
		Diary diary = diaryService.get(name, content);
	%>
	日记：<%=diary.toString()%>
</body>
</html>