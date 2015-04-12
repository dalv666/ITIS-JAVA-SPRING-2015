package su.dalv.itis.java.spring.task16;


public interface Repository {

    void save(String message) throws DatabaseRuntimeException;
}
