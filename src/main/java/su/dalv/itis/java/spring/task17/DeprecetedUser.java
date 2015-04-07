package su.dalv.itis.java.spring.task17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeprecetedUser {

    @Autowired
    private CommonInterface commonInterface;

    public CommonInterface getCommonInterface() {
        return commonInterface;
    }

    public void setCommonInterface(CommonInterface commonInterface) {
        this.commonInterface = commonInterface;
    }



    public void use(){
        commonInterface.itis();
    }
}
