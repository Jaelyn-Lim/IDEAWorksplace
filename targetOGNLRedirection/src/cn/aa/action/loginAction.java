package cn.aa.action;

import com.jaelyn.bean.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jaelyn on 11/10/2016.
 */
public class loginAction extends ActionSupport {
    private User user;
   // private String tip;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

   /* public String getTip() {
        return tip;
    }*/

  /*  public void setTip(String tip) {
        this.tip = tip;
    }*/

    @Override
    public String execute() throws Exception {
        //setTip("提示跳转");
        return SUCCESS;
    }

    @Override
    public void validate() {
        System.out.print("qweqweqweqweqweqweqweqweqweqweqweqweqweqeqeqeqw");
        if(user.getName()==null) {
            addFieldError("user", "测试");
        }
    }
}
