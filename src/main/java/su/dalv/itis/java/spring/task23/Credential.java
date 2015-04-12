package su.dalv.itis.java.spring.task23;

/**
 * Created by dalv6_000 on 11.04.2015.
 */
public class Credential {

    private String login;
    private String password;
    private String name;

    public Credential(String login, String name, String password) {
        this.login = login;
        this.name = name;
        this.password = password;
    }

    public Credential() {
        super();
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
