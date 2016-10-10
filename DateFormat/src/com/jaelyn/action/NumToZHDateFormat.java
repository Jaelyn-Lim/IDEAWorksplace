package com.jaelyn.action;

import com.jaelyn.bean.NumToZH;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jaelyn on 09/10/2016.
 */
public class NumToZHDateFormat extends ActionSupport {
    private NumToZH numToZH;
    private String msg;

    public NumToZH getNumToZH() {
        return numToZH;
    }

    public void setNumToZH(NumToZH numToZH) {
        this.numToZH = numToZH;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
