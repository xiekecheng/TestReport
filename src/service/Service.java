package service;

import beans.Profit;
import jdbc.JdbcConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: TestReport
 * @description: 逻辑层判断
 * @author: Mr.Xie
 * @create: 2018-08-26 20:04
 **/
public class Service {
    private Connection dbconnection;
    private Statement st,st1,st2;
    private ResultSet rs,rs1,rs2;
    private String sql;
    private List list;
    private Profit pf;

    public List getProfit(){
        list = new ArrayList();
        dbconnection = JdbcConn.getConnection();
        try {
            st =  dbconnection.createStatement();
            st1 = dbconnection.createStatement();
            st2 = dbconnection.createStatement();
            sql = " SELECT  g.GOODS_NAME goodsName, g.SELLING_PRICE selling,g.COST_PRICE costPrice,g.GOODS_ID goodsID FROM GOODSLIST g,TRADING_INFORMATION t WHERE t.TRADING_GOODS_ID = g.GOODS_ID GROUP BY g.GOODS_NAME, g.SELLING_PRICE ,g.COST_PRICE,g.GOODS_ID ";
            rs = st.executeQuery(sql);

            int temp;
            while (rs.next()){
                pf = new Profit();
                pf.setGoodsName(rs.getString("goodsName"));
                pf.setSellingPrice(rs.getInt("selling"));
                pf.setCostPrice(rs.getInt("costPrice"));
                pf.setGoodsId(rs.getInt("goodsID"));
                temp = 0;
                temp = pf.getSellingPrice() - pf.getCostPrice();
                System.out.println(pf.getGoodsId());
                sql = "SELECT sum(t.TRADING_NUMBER) sumNum FROM TRADING_INFORMATION t WHERE TRADING_GOODS_ID = "+pf.getGoodsId();
                rs1 = st1.executeQuery(sql);
                while (rs1.next()){
                    pf.setTradingNum(rs1.getInt("sumNum"));
                }
                //利润=(售价-成本价)*销售数量;
                pf.setProfit(temp*pf.getTradingNum());

                sql = "SELECT count(t.TRADING_ID) times FROM TRADING_INFORMATION t WHERE t.TRADING_GOODS_ID ="+pf.getGoodsId();
                rs2 = st2.executeQuery(sql);
                while (rs2.next()){
                    pf.setTimes(rs2.getInt("times"));
                }
                list.add(pf);
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
