package com.jaelyn.Action;

import com.jaelyn.Bean.Goods;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by Jaelyn on 08/10/2016.
 */
public class AddGoodsActionList extends ActionSupport {

    private List<Goods> goodsList;

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
