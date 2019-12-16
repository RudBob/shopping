package cn.edu.zzuli.ry.bean;

/**
 * @author ry
 * 顾客
 */
public class User {
    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 用户账号
     */
    private String username;

    /**
     * 用户手机号
     */
    private String tel;

    /**
     * 用户密码
     */
    private String password;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
