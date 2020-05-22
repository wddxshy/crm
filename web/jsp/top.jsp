<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<STYLE type=text/css>
    BODY {
        PADDING-RIGHT: 0px;
        PADDING-LEFT: 0px;
        PADDING-BOTTOM: 0px;
        MARGIN: 0px;
        PADDING-TOP: 0px;
        BACKGROUND-COLOR: #2a8dc8
    }

    BODY {
        FONT-SIZE: 12px;
        COLOR: #003366;
        FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
    }

    TD {
        FONT-SIZE: 12px;
        COLOR: #003366;
        FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
    }

    DIV {
        FONT-SIZE: 12px;
        COLOR: #003366;
        FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
    }

    P {
        FONT-SIZE: 12px;
        COLOR: #003366;
        FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
    }
</STYLE>
<script type="text/javascript">
    function logout() {
        var flag = confirm("确定退出登录？");
        if (flag){
            location.href="${pageContext.request.contextPath}/user/logout.x"
        }
    }
</script>
<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
<FORM id=form1 name=form1 action="" method=post>
    <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
            <TD width=10><IMG src="${pageContext.request.contextPath}/images/new_001.jpg" border=0></TD>
            <TD background=${pageContext.request.contextPath}/images/new_002.jpg><FONT size=5><B>客户关系管理系统v1.0</B></FONT></TD>
            <TD background=${pageContext.request.contextPath}/images/new_002.jpg>
                <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
                    <TBODY>
                    <TR>
                        <TD align=right height=35></TD>
                    </TR>
                    <TR>
                        <TD height=35 align="right">
                            当前用户：${user.userCode}
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <A href="${pageContext.request.contextPath}/jsp/editUser.jsp" target="_blank"><FONT color=red>修改密码</FONT></A>
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <A href="javaScript:void(0)" onclick="logout();"><FONT color=red>安全退出</FONT></A>
                        </TD>
                    </TR>
                    </TBODY>
                </TABLE>
            </TD>
            <TD width=10><IMG src="${pageContext.request.contextPath}/images/new_003.jpg" border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
</FORM>
</BODY>
</html>
