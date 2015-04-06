package su.dalv.itis.java.spring.task3;


import java.util.List;


public class TalkingRobotImpl implements TalkingRobot {

    private List<Quoter> quoterList;

    public List<Quoter> getQuoterList() {
        return quoterList;
    }

    public void setQuoterList(List<Quoter> quoterList) {
        this.quoterList = quoterList;
    }

    public void talk() {
        for (Quoter quater : quoterList) {
            quater.sayQuote();
        }
    }
}
