package com.jaelyn.Action;

import com.jaelyn.Bean.Goods;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jaelyn on 08/10/2016.
 */
public class AddGoodsAction extends ActionSupport {
    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
