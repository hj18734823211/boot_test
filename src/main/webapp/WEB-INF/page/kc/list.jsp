<%--
  Created by IntelliJ IDEA.
  User: chengch
  Date: 2020/9/11
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/layer/layer.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/layui/layui.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/layui/css/layui.css" media="all">
</head>
<body>
    <table border="1px">
        <tr>
            <th>考场名称</th>
            <th>参考人数</th>
            <th>开始时间~结束时间</th>
            <th>状态</th>
        </tr>
        <tbody id="tbd"></tbody>
    </table>
</body>
<script type="text/javascript">
    $(function () {
        show();
    })

    function show() {
        $.post(
            "<%=request.getContextPath()%>/kc/list",
            {},
            function (data) {
                var html = "";
                for (var i = 0; i < data.data.length; i++) {
                    var kc = data.data[i];
                    html += "<tr>";
                    html += "<td><a href='#' onclick='toDetail("+kc.kcId+")'>"+kc.kcName+"</a></td>"
                    html += "<td>"+kc.kcNum+"</td>";
                    html += "<td>"+kc.startTime+"~"+kc.endTime+"</td>";
                    html += "<td>"+kc.kcStatus+"</td>";
                    html += "</tr>";
                }
                $("#tbd").html(html);
            }
        )
    }

    //去详情
    function toDetail(kcId) {
        layer.open({
            type: 2,
            content: "<%=request.getContextPath()%>/kc/toDetail?kcId="+kcId,
            title: "详情",
            shade: 0.6,
            area: ['500px', '300px']
        });
    }
</script>
</html>
