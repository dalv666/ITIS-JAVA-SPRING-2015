package su.dalv.itis.java.spring.task19.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import su.dalv.itis.java.spring.task19.mapper.GuestMapper;
import su.dalv.itis.java.spring.task19.mapper.OrderMapper;
import su.dalv.itis.java.spring.task19.model.Guest;
import su.dalv.itis.java.spring.task19.model.Order;

import java.util.List;

public class OrderDao extends JdbcDaoSupport implements Dao<Order> {

    public Order findByid(long id) {
        String sql = "SELECT * FROM ORDERING WHERE ORDER_ID = ?";
        List<Order> query = getJdbcTemplate().query(sql, new Object[]{id}, new OrderMapper());
        return query.get(0);
    }

    public void insert(Order order) {
        String sql = "INSERT INTO ORDERING (ORDER_ID, ORDER_EVENT_ID, ORDER_GUEST_ID) VALUES (?, ?,?)";
        getJdbcTemplate().update(sql, new Object[]{order.getId(),order.getEvent().getId(),order.getGuest().getId()});
    }

    public List<Guest> findAllGuestByEvent(long id){
        String sql = "SELECT GUEST_ID, GUEST_FIRST_NAME,GUEST_SECON_NAME,GUEST_CARD_NUMBER FROM ORDERING WHERE ID_EVENT = ? LEFT JOIN GUEST ON ORDER_GUEST_ID = GUEST_ID";
        List<Guest> query = getJdbcTemplate().query(sql, new Object[]{id}, new GuestMapper());
        return query;
    }

    public void delete(Order order) {

    }
}
