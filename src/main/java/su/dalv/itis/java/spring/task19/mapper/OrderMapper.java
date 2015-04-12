package su.dalv.itis.java.spring.task19.mapper;

import org.springframework.jdbc.core.RowMapper;
import su.dalv.itis.java.spring.task19.model.Event;
import su.dalv.itis.java.spring.task19.model.Guest;
import su.dalv.itis.java.spring.task19.model.Order;

import java.sql.ResultSet;
import java.sql.SQLException;


public class OrderMapper implements RowMapper<Order> {
    public Order mapRow(ResultSet resultSet, int i) throws SQLException {
        long id = resultSet.getLong(1);
        long guestId = resultSet.getLong(2);
        long eventId = resultSet.getLong(3);
        Event event = new Event();
        event.setId(eventId);
        Guest guest = new Guest();
        guest.setId(guestId);
        return new Order(event, guest, id);
    }
}
