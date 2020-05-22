<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>添加客户</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
	<script>
		function loadSelect(typeCode,selectLocation,selectName){
			var $select = $("<select name='"+selectName+"'>");
			var option = '<option>---请选择---</option>';
			$select.append(option);
			$.ajax({
				type:'get',
				url:'${pageContext.request.contextPath }/dict/typecode/'+typeCode+".x",
				success:function (data) {
					$.each(data,function (i,dict) {
						// alert("dict.id="+dict.dictid+" :dict.dictItemName= "+dict.dictitemname);
						var $option = '<option value="'+dict.dictid+'">'+dict.dictitemname+'</option>';
						$select.append($option);
					});
				}
			});
			$select.append("</select>");
			$("#"+selectLocation).html($select);
		}
		//页面加载完毕，从数据库异步获取下拉选择框的内容
		$(function () {
			loadSelect("006","levelSelectId","custLevel");
			loadSelect("002","sourceSelectId","custSource");
			loadSelect("001","industrySelectId","custIndustry");
		})
	</script>

<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form1 name=form1
		action="${pageContext.request.contextPath }/customer/insert.x"
		method=post>
		

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：客户管理 &gt; 添加客户</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<TABLE cellSpacing=0 cellPadding=5  border=0>
						  
						    
							<TR>
								<td>客户名称：</td>
								<td>
								<INPUT class=textbox id="sChannel2"
														style="WIDTH: 180px" maxLength=50 name="custName">
								</td>
								<td>客户级别 ：</td>
								<td id="levelSelectId">
<%--									<select name="custLevel">--%>
<%--										<option>---请选择---</option>--%>
<%--										<option id="1">普通客户</option>--%>
<%--										<option id="2">VIP客户</option>--%>
<%--									</select>--%>
<%--								<INPUT class=textbox id=sChannel2--%>
<%--														style="WIDTH: 180px" maxLength=50 name="custLevel">--%>
								</td>
							</TR>
							
							<TR>
								
								<td>信息来源 ：</td>
								<td id="sourceSelectId">
<%--								<INPUT class=textbox id=sChannel2--%>
<%--														style="WIDTH: 180px" maxLength=50 name="custSource">--%>
								</td>
								<td>联系人：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custLinkman">
								</td>
							</TR>
							
							<TR>
								
								
								<td>固定电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custPhone">
								</td>
								<td>移动电话 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custMobile">
								</td>
							</TR>
							
							<TR>
								<td>联系地址 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custAddress">
								</td>
								<td>邮政编码 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custZip">
								</td>
							</TR>
							<TR>
								<td>客户传真 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2
														style="WIDTH: 180px" maxLength=50 name="custFax">
								</td>
								<td>所属行业 ：</td>
								<td id="industrySelectId">
<%--								<INPUT class=textbox id=sChannel2--%>
<%--														style="WIDTH: 180px" maxLength=50 name="custWebsite">--%>
								</td>
							</TR>
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" 保存 " name=sButton2>
								</td>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
