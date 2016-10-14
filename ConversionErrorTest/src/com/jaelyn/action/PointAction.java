package com.jaelyn.action;

import com.jaelyn.bean.Point;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jaelyn on 13/10/2016.
 */
public class PointAction extends ActionSupport {

    private Point point;
    private String tip;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String execute() throws Exception {
        setTip("这里经过了action的execute方法,返回success页面");
        return SUCCESS;
    }

}
