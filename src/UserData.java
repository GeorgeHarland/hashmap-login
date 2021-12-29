import java.util.HashMap;

public class UserData {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    UserData() {
        logininfo.put("Karma","password123");
        logininfo.put("Cobalt","PASS");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}