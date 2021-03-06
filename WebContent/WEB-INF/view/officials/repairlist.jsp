<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=path %>/css/pintuer.css">
<link rel="stylesheet" href="<%=path %>/css/admin.css">
<script src="<%=path %>/js/jquery.js"></script>
<script src="<%=path %>/js/pintuer.js"></script>
</head>
<body>
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder">维修记录</strong> 
			</div>

			<table class="table table-hover text-center">
				<tr>
					<th>维修编号</th>
					<th>车辆编号</th>
					<th>司机编号</th>
					<th>维修原因</th>					
					<th>维修地点</th>
					<th>维修日期</th>
					<th>维修金额</th>
					<th width="310">操作</th>
				</tr>
				<c:forEach items="${list}" var="p">
					<tr>
						<td>${p.repair_id}</td>
						<td>${p.car_id}</td>
						<td>${p.driver_id}</td>
						<td>${p.repair_content}</td>
						<td>${p.repair_unit}</td>
						<td>${p.repair_date}</td>
						<td>${p.repair_money}</td>
						<td><div class="button-group">
								<a class="button border-main"href="<%=path %>/rapairCtrl/queryrapair">
								<span class="icon-edit"></span>用车</a>
							</div></td>
					</tr>
				</c:forEach>

				<tr>
					<td colspan="8"><div class="pagelist">
							<c:if test="${currpage > 1}">
								<a href="<%=path %>/carCtrl/queryCar?currpage=${currpage-1}">上一页</a>
							</c:if>
							<c:if test="${currpage < pagecount}">|当前${currpage}页/总${pagecount}页|
        <a href="<%=path %>/carCtrl/queryCar?currpage=${currpage+1}">下一页</a>
							</c:if>
						</div></td>
				</tr>
			</table>
		</div>
</body>
<script>
	$(function(){
		//alert('${list}');
	})
</script>
</html>