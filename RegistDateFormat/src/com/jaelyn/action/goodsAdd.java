package com.jaelyn.action;

import com.jaelyn.bean.Goods;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jaelyn on 09/10/2016.
 */
public class goodsAdd extends ActionSupport {
    private Goods goods;
    private String msg;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String execute() throws Exception {
        setMsg("类型转换成功");
        return SUCCESS;
    }
}
