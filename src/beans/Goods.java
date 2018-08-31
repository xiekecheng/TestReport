package beans;

/**
 * @program: TestReport
 * @description: 商品类
 * @author: Mr.Xie
 * @create: 2018-08-26 18:23
 **/
public class Goods {
    /**
     * 商品ID
     */
    private int goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品成本价
     */
    private int costPrice;
    /**
     * 销售价格
     */
    private int selling;
    /**
     * 生产商
     */
    private String manufacturer;

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public void setSelling(int selling) {
        this.selling = selling;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSelling() {
        return selling;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
