package cn.aa.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jaelyn on 10/10/2016.
 */
public class ABC extends ActionSupport{

    private String aa;

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String login(){
        System.out.print("回复挥洒粉红色大会");
        return SUCCESS;
    }

    public String aaaa(){
        System.out.print("刚刚给人舒服风格");
        return SUCCESS;
    }
}
