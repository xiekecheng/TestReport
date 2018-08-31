package beans;

/**
 * @program: TestReport
 * @description: 利润表
 * @author: Mr.Xie
 * @create: 2018-08-26 18:30
 **/
public class Profit {
    /**
     * 商品名
     */
    private String goodsName;
    /**
     * 商品id
     */
    private int goodsId;
    /**
     * 成本价
     */
    private int costPrice;
    /**
     * 售价
     */
    private int sellingPrice;
    /**
     * 交易号
     */
    private int tradingNum;
    /**
     * 交易笔数
     */
    private int times;
    /**
     * 利润
     */
    private int profit;

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setTradingNum(int tradingNum) {
        this.tradingNum = tradingNum;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int getTradingNum() {
        return tradingNum;
    }

    public int getTimes() {
        return times;
    }

    public int getProfit() {
        return profit;
    }
}
