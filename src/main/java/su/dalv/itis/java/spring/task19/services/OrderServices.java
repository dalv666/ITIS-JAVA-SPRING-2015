package su.dalv.itis.java.spring.task19.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.dalv.itis.java.spring.task19.dao.OrderDao;
import su.dalv.itis.java.spring.task19.model.Event;
import su.dalv.itis.java.spring.task19.model.Guest;
import su.dalv.itis.java.spring.task19.model.Order;

import java.util.List;

@Service
public class OrderServices {


    @Autowired
    private OrderDao orderDao;


    void regGuest(long id, Guest guest, Event event) {
        Order order = new Order();
        order.setEvent(event);
        order.setGuest(guest);
        order.setId(id);
        orderDao.insert(order);
    }

    public List<Guest> guestList(Event event) {
        return orderDao.findAllGuestByEvent(event.getId());
    }


}
