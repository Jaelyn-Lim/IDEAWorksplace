package com.jaelyn.action;

import com.jaelyn.bean.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jaelyn on 09/10/2016.
 */
public class registAction extends ActionSupport {
    private User user;
    private String tip;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String execute() throws Exception {
        setTip("转换成功");
        return SUCCESS;
    }
}
