package cn.edu.zzuli.ry.bean;

/**
 * @author ry
 * 商品
 */
public class Goods {
    /**
     * 商品id
     */
    private Integer gid;
    /**
     * 商品名称
     */
    private String gname;

    /**
     * 商品描述
     */
    private String gdescription;

    /**
     * 商品价格
     */
    private Double price;
    /**
     * 商品库存量
     */
    private Integer goodsNum;

    /**
     * 商品销量
     */
    private Integer saleNum;


    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGdescription() {
        return gdescription;
    }

    public void setGdescription(String gdescription) {
        this.gdescription = gdescription;
    }
}
