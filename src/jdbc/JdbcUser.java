package jdbc;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/11 14:52
 */
public class JdbcUser {

    private int uId;

    private String uUserName;

    private String uPassword;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuUserName() {
        return uUserName;
    }

    public void setuUserName(String uUserName) {
        this.uUserName = uUserName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }


    @Override
    public String toString() {
        return "JdbcUser{" +
                "uId=" + uId +
                ", uUserName='" + uUserName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                '}';
    }
}
