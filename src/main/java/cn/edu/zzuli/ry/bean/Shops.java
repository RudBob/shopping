package cn.edu.zzuli.ry.bean;

/**
 * @author ry
 * 商店
 */
public class Shops {
    /**
     * 商店id
     */
    private Integer sid;

    /**
     * 商店名称
     */
    private String shopName;

    /**
     * 商店店主
     */
    private User user;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
