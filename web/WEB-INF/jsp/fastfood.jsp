<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.List"%>
<%@page import="po.Fastfood"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Object obj = request.getAttribute("msg");
    if(obj instanceof Fastfood || obj instanceof List) {
        Gson gson = new Gson();
        out.print(gson.toJson(obj));
    } else {
        out.print(obj);
    }
%>

