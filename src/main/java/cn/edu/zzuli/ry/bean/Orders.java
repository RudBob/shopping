package cn.edu.zzuli.ry.bean;

import java.util.List;

/**
 * @author ry
 * 订单
 */
public class Orders {
    /**
     * 订单id
     */
    private Integer oid;

    /**
     * 订单关联的商品们
     */
    private List<Goods> goods;

    /**
     * 订单价格
     */
    private Double allprice;

    /**
     * 订单关联用户
     */
    private User busyer;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public Double getAllprice() {
        return allprice;
    }

    public void setAllprice(Double allprice) {
        this.allprice = allprice;
    }

    public User getBusyer() {
        return busyer;
    }

    public void setBusyer(User busyer) {
        this.busyer = busyer;
    }
}
