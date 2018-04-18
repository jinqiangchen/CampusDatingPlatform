package cn.net.jqchen.model;

public class Login {
    private Integer loginId;

    private String loginAccount;

    private String loginPwd;

    private Integer accountDegree;

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    public Integer getAccountDegree() {
        return accountDegree;
    }

    public void setAccountDegree(Integer accountDegree) {
        this.accountDegree = accountDegree;
    }
}