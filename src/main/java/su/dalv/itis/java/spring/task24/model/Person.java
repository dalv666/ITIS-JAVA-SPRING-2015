package su.dalv.itis.java.spring.task24.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Person")
@XmlType(propOrder = {"id","name","isAdmin"})
public class Person {

    private long id;

    private String name;

    private boolean isAdmin;

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", isAdmin=" + isAdmin +
                ", name='" + name + '\'' +
                '}';
    }
}
