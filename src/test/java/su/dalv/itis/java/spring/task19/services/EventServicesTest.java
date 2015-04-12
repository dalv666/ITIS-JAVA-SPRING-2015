package su.dalv.itis.java.spring.task19.services;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import su.dalv.itis.java.spring.task19.model.Event;

public class EventServicesTest extends CommonTest{

    @Autowired
    private EventServices eventServices;

    @Test
    public void saveEventTest(){
        Event event = new Event();
        event.setId(1l);
        event.setTitle("my first event");
        eventServices.insert(event);

        Event byid = eventServices.findByid(1l);

        System.out.println(byid.equals(event));
    }

}