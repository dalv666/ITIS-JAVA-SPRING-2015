package su.dalv.itis.java.spring.task19.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.dalv.itis.java.spring.task19.dao.GuestDao;
import su.dalv.itis.java.spring.task19.model.Guest;

@Service
public class GuestServices {

    @Autowired
    private GuestDao guestDao;

    public Guest findByid(long id) {
        return  guestDao.findByid(id);
    }

    public void insert(Guest guest) {
        guestDao.insert(guest);
    }
}
