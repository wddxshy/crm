﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <TITLE>客户列表</TITLE>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
    <LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
          rel=stylesheet>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.5.1.js"></script>
    <SCRIPT language=javascript>
        function to_page(page) {
            if (page) {
                $("#page").val(page);
            }
            document.customerForm.submit();

        }
        function submitForm(flag) {
            if (flag == 'query'){
                $("#customerForm").attr("action","${pageContext.request.contextPath}/customer/list.x")
            }else {
                $("#customerForm").attr("action","${pageContext.request.contextPath}/customer/deleteBatch.x")
            }
            $("#customerForm").submit();
        }
    </SCRIPT>

    <META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
<FORM id="customerForm" name="customerForm"
      action="${pageContext.request.contextPath}/customer/list.x"
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
                        <TD class=manageHead>当前位置：客户管理 &gt; 客户列表</TD>
                    </TR>
                    <TR>
                        <TD height=2></TD>
                    </TR>
                </TABLE>
                <TABLE borderColor=#cccccc cellSpacing=0 cellPadding=0
                       width="100%" align=center border=0>
                    <TBODY>
                    <TR>
                        <TD height=25>
                            <TABLE cellSpacing=0 cellPadding=2 border=0>
                                <TBODY>
                                <TR>
                                    <TD>客户名称：</TD>
                                    <TD><INPUT class=textbox id=sChannel2
                                               style="WIDTH: 80px" maxLength=50 name="custName"
                                                value="${cstCustomer.custName}"></TD>

                                    <TD>
                                        <INPUT class=button id=sButton2 type=submit value=" 筛选 " onclick="submitForm('query')">
                                        <INPUT class=button id=sButton2 type=submit value=" 批量删除 " onclick="submitForm('delete')">
                                    </TD>
                                </TR>
                                </TBODY>
                            </TABLE>
                        </TD>
                    </TR>

                    <TR>
                        <TD>
                            <TABLE id=grid
                                   style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
                                   cellSpacing=1 cellPadding=2 rules=all border=0>
                                <TBODY>
                                <TR
                                        style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
                                    <td>&nbsp;</td>
                                    <TD>客户名称</TD>
                                    <TD>客户级别</TD>
                                    <TD>客户来源</TD>
                                    <TD>联系人</TD>
                                    <TD>电话</TD>
                                    <TD>手机</TD>
                                    <TD>操作</TD>
                                </TR>
                                <c:forEach items="${customerListByPage.data}" var="CustomerCustom">
                                    <TR
                                            style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
                                        <td><input type="checkbox" name="ids" value="${CustomerCustom.custId}"></td>
                                        <TD>
                                                ${CustomerCustom.custName }
                                        </TD>
                                        <TD>
                                                ${CustomerCustom.custLevel }
                                        </TD>
                                        <TD>
                                                ${CustomerCustom.custSource }
                                        </TD>
                                        <TD>${CustomerCustom.custLinkman }</TD>
                                        <TD>${CustomerCustom.custPhone }</TD>
                                        <TD>${CustomerCustom.custMobile }</TD>
                                        <TD>
                                            <c:if test="${flag == 'select'}">
                                                
                                            </c:if>
                                            <a href="${pageContext.request.contextPath }/customer/toEdit/${CustomerCustom.custId}.x">修改</a>
                                            &nbsp;&nbsp;
                                            <a href="${pageContext.request.contextPath }/customer/delete.x?custId=${CustomerCustom.custId}">删除</a>
                                        </TD>
                                    </TR>

                                </c:forEach>

                                </TBODY>
                            </TABLE>
                        </TD>
                    </TR>

                    <TR>
                        <TD><SPAN id=pagelink>
											<DIV
                                                    style="LINE-HEIGHT: 20px; HEIGHT: 20px; TEXT-ALIGN: right">
												共[<B>${customerListByPage.total}</B>]条记录,[<B>${customerListByPage.totalPage}</B>]页
												,每页显示
												<select name="pageSize">
												
												<option value="15"
                                                        <c:if test="${customerListByPage.pageSize==1 }">selected</c:if>>1</option>
												<option value="30"
                                                        <c:if test="${customerListByPage.pageSize==30 }">selected</c:if>>30</option>
												</select>
												条
												[<A href="javascript:to_page(${customerListByPage.page-1})">前一页</A>]
												<B>${page}</B>
												[<A href="javascript:to_page(${customerListByPage.page+1})">后一页</A>]
												到
												<input type="text" size="3" id="page" name="page"/>
												页
												
												<input type="button" value="Go" onclick="to_page()"/>
											</DIV>
									</SPAN></TD>
                    </TR>
                    </TBODY>
                </TABLE>
            </TD>
            <TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg"><IMG
                    src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
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
