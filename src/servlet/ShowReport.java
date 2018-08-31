package servlet;

import service.Service;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @program: TestReport
 * @description: 调用
 * @author: Mr.Xie
 * @create: 2018-08-30 19:29
 **/
public class ShowReport extends HttpServlet {


    public ShowReport(){
        super();
    }
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String test = "test";
        request.setAttribute("test",test);
        List list;
        Service service = new Service();
        list = service.getProfit();
        request.getSession().setAttribute("PROFIT",list);
        response.sendRedirect("../index.jsp");

    }
}
