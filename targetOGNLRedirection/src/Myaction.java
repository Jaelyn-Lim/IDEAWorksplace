import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jaelyn on 10/10/2016.
 */
public class Myaction extends ActionSupport {
    private String target;




    @Override
    public String execute() throws Exception {

        System.out.print("qwrqwwqrwerqwer234315415435435");
        return SUCCESS;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

}
