<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<STYLE type=text/css>
BODY {
	FONT-SIZE: 12px; COLOR: #ffffff; FONT-FAMILY: 宋体
}
TD {
	FONT-SIZE: 12px; COLOR: #ffffff; FONT-FAMILY: 宋体
}
</STYLE>

<META content="MSHTML 6.00.6000.16809" name=GENERATOR>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>

<script type="text/javascript">
	window.onload=function(){

		if(window.parent != window){// 如果是在框架中
			//就让框架页面跳转到登陆页面
			window.parent.location.href = "${pageContext.request.contextPath}/login.jsp";
		}

	};
	function checkSubmit() {
	  var submitFlag = false;
      var oldPass = $("#oldPass").val();
      var passdb = ${user.userPassword};
      if (oldPass != passdb){
        submitFlag = false;
      }else {
          var newPass = $("#newPassword").val();
          if (newPass != ''){
              var restPass = $("#newPassword2").val();
              if (newPass == restPass){
                  submitFlag = true;
              }
          }
      }
      return submitFlag;
    }
</script>

</HEAD>
<BODY>
<FORM id=form1 name=form1 action="${pageContext.request.contextPath}/user/edit.x" onsubmit="return checkSubmit();"  method="post">
<input type="hidden" id="submitFlag">
<input type="hidden" name="userId" value="${user.userId}">
<DIV id=UpdatePanel1>
<DIV id=div1 
style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>
<DIV id=div2 
style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>


<DIV>&nbsp;&nbsp; </DIV>
<DIV>
<TABLE cellSpacing=0 cellPadding=0 width=900 align=center border=0>
  <TBODY>
  <TR>
    <TD style="HEIGHT: 105px"><IMG src="${pageContext.request.contextPath}/images/login_1.gif"
  border=0></TD></TR>
  <TR>
    <TD background="${pageContext.request.contextPath}/images/edit_2.jpg" height=300>
      <TABLE height=300 cellPadding=0 width=900 border=0>
        <TBODY>
        <TR>
          <TD colSpan=2 height=35></TD></TR>
        <TR>
          <TD width=360></TD>
          <TD>
            <TABLE cellSpacing=0 cellPadding=2 border=0>
              <TBODY>
              <TR>
                <TD style="HEIGHT: 28px" width=80>账 号：</TD>
                <TD style="HEIGHT: 28px" width=150>
                <INPUT id="userCode" style="WIDTH: 130px" name="userCode" readonly="readonly" value="${user.userCode}"/><br/>
                <font color="red" id="codeTip" ></font></TD>
                <TD style="HEIGHT: 28px" width=370><SPAN 
                  id=RequiredFieldValidator3 
                  style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入账号</SPAN></TD></TR>
              <TR>
                <TD style="HEIGHT: 28px">旧密码：</TD>
                <TD style="HEIGHT: 28px">
                <INPUT id="oldPass" style="WIDTH: 130px" type=password name="oldPassword"></TD>
                <TD style="HEIGHT: 28px">
               	<font color="red" id="oldPassTip" ></font>
                <SPAN id=RequiredFieldValidator4 
                  style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入旧密码</SPAN></TD></TR>
              <TR>
                <TD style="HEIGHT: 28px">新密码：</TD>
                <TD style="HEIGHT: 28px"><INPUT id="newPassword" type="password" style="WIDTH: 130px" name="userPassword"></TD>
                <TD style="HEIGHT: 28px">&nbsp;<font color="red" id="newPassTip" ></font></TD></TR>
              <TR>
                <TD style="HEIGHT: 28px">确认密码：</TD>
                <TD style="HEIGHT: 28px"><INPUT id="newPassword2" type="password" style="WIDTH: 130px" ></TD>
                <TD style="HEIGHT: 28px">&nbsp;</TD></TR>
              <TR>
                <TD style="HEIGHT: 18px" colspan="2" ><font color="red" ></font></TD>
                <TD style="HEIGHT: 18px"></TD></TR>
              <TR>
                <TD></TD>
                <TD><INPUT id=btn 
                  style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px" 
                  type=image src="${pageContext.request.contextPath}/images/regist_button.png" name=btn> 
              </TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR>
  <TR>
    <TD><IMG src="${pageContext.request.contextPath}/images/login_3.jpg" 
border=0></TD></TR></TBODY></TABLE></DIV></DIV>


</FORM>
</BODY></HTML>
