package cn.net.jqchen.model;

public class Admin {
    private String adminAccount;

    private String adminNickname;

    private String adminRealname;

    private Integer state;

    private Integer iscancel;

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminNickname() {
        return adminNickname;
    }

    public void setAdminNickname(String adminNickname) {
        this.adminNickname = adminNickname == null ? null : adminNickname.trim();
    }

    public String getAdminRealname() {
        return adminRealname;
    }

    public void setAdminRealname(String adminRealname) {
        this.adminRealname = adminRealname == null ? null : adminRealname.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIscancel() {
        return iscancel;
    }

    public void setIscancel(Integer iscancel) {
        this.iscancel = iscancel;
    }
}