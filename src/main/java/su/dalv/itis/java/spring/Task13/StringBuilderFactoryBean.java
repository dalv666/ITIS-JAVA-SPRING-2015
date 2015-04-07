package su.dalv.itis.java.spring.Task13;


import org.springframework.beans.factory.FactoryBean;

public class StringBuilderFactoryBean implements FactoryBean<StringBuilder>{

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public StringBuilder getObject() throws Exception {
        StringBuilder stringBuilder = new StringBuilder("init message ");
        stringBuilder.append(message);
        return stringBuilder;
    }

    public Class<?> getObjectType() {
        return StringBuilder.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
