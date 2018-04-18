package cn.net.jqchen.model;

public class Superadmin {
    private String superadminAccount;

    private String nickname;

    private String realname;

    private Integer state;

    public String getSuperadminAccount() {
        return superadminAccount;
    }

    public void setSuperadminAccount(String superadminAccount) {
        this.superadminAccount = superadminAccount == null ? null : superadminAccount.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}