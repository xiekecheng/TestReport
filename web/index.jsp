<%@ page import="java.util.List" %>
<%@ page import="beans.Profit" %><%--
  Created by IntelliJ IDEA.
  User: xkc
  Date: 2018/8/26
  Time: 下午6:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <style type="text/css">
          table,th,td,tr{
              border: 1px solid black;
          }
      </style>
  </head>
  <body>
  <h1>这是我的JSP页面</h1>
  <hr>
  <form action="servlet/ShowReport" method="post">
    <input type="submit" value="生成报表">
  </form>
  <table>
    <tr ><th colspan="5">利润表</th></tr>
      <tr>
          <th>序号</th>
          <th>商品名称</th>
          <th>售出数量</th>
          <th>交易笔数</th>
          <th>盈利额</th>
      </tr>
  <%
    List list = null;
    if (session.getAttribute("PROFIT")!=null){

        list = (List)session.getAttribute("PROFIT");
        if (list.size()>0&&list!=null){
            int temp =0;
            int temp1 =0;
            int temp2 =0;
            int temp3 =0;
            Profit pf;

            for (int i=0;i<list.size();i++){
                pf =new Profit();
                pf=(Profit) list.get(i);
                temp1+=pf.getTradingNum();
                temp2+=pf.getTimes();
                temp3+=pf.getProfit();
            %>
      <tr >
          <td><%=temp+=1%></td>
          <th><%=pf.getGoodsName()%></th>
          <th><%=pf.getTradingNum()%></th>
          <th><%=pf.getTimes()%></th>
          <th><%=pf.getProfit()%></th>
      </tr>
            <%
            }
            %>
      <tr >
          <td colspan="2">合计</td>
          <th><%=temp1%></th>
          <th><%=temp2%></th>
          <th><%=temp3%></th>
      </tr>
      <%
        }
    }
  %>
  </table>
  </body>
</html>
