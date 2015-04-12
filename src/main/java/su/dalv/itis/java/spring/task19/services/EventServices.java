package su.dalv.itis.java.spring.task19.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.dalv.itis.java.spring.task19.dao.EventDao;
import su.dalv.itis.java.spring.task19.model.Event;

@Service
public class EventServices {

    @Autowired
    private EventDao eventDao;

    public Event findByid(long id) {
        return eventDao.findByid(id);
    }

    public void insert(Event event) {
        eventDao.insert(event);
    }

}
