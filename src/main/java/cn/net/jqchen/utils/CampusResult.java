package cn.net.jqchen.utils;

import java.io.Serializable;

public class CampusResult implements Serializable{
    // 响应业务状态
    private Integer status;
    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public CampusResult(){
        this.status=200;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
