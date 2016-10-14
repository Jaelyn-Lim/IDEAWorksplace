package cn.aa.action;

import com.jaelyn.bean.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jaelyn on 11/10/2016.
 */
public class toolsAction extends ActionSupport {
    private String sth;

    public String getSth() {
        return sth;
    }

    public void setSth(String sth) {
        this.sth = sth;
    }

    @Override
    public void validate() {
        if(!sth.contains(",")){
            addFieldError("user","不符合，缺少,");
        }
    }
}
